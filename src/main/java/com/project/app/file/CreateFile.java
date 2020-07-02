package file;

import org.openqa.selenium.WebElement;
import util.DateTime;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class CreateFile {
    String fileFullPath;

    public CreateFile(){
        this.fileFullPath = createTxtFileTimestamp();
    }

    public String getFileFullPath(){ return fileFullPath;}
    public void setFileFullPath(String fileFullPath){ this.fileFullPath = fileFullPath; }

public String createTxtFileTimestamp(){

    String fileN = "//createFiles" + "//fileName" + DateTime.getTimestamp() + ".txt";
    return fileN;
}

    public void createFile(){
        File file = new File(getFileFullPath());
        try {
            if(file.createNewFile()){
                System.out.println("File created: " + file.getName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeList(List<WebElement> list, String writeFile){

        try {
            FileWriter writer = new FileWriter(writeFile, false);
            BufferedWriter bw = new BufferedWriter(writer);
            int count = 0;
            for(WebElement link: list){
                bw.write(link.getAttribute("href"));
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> readToList(String readFile){
        try {
            File rFile = new File(readFile);
            Scanner scn = new Scanner(rFile);
            ArrayList<String> wList = new ArrayList<String>();
            while (scn.hasNext()) {
                String next = scn.next();
                wList.add(next);
            }
            return wList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<String> readToList2(String readFile){
        try {
            File rFile = new File(readFile);
            Scanner scn = new Scanner(rFile);
            ArrayList<String> wList = new ArrayList<String>();
            while (scn.hasNextLine()) {
                String next = scn.next();
                wList.add(next);
            }
            return wList;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
