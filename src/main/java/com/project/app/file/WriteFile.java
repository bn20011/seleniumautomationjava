package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {


    public void writeList(ArrayList<String> list, String writeFile){

        try {
            FileWriter writer = new FileWriter(writeFile, false);
            BufferedWriter bw = new BufferedWriter(writer);
            int count = 0;
            while (list.size() > count) {
                bw.write(list.get(count));
                bw.newLine();
                count++;
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
