package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    LocalDateTime localDateTime;
    static String  timestamp;

    public DateTime(){
        this.localDateTime = LocalDateTime.now();

    }

    public LocalDateTime getLocalDateTime(){
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime){
        this.localDateTime = LocalDateTime.now();
    }


    public void printLocalDateTime(){
        System.out.println("Local Date Time is: " + localDateTime);

    }

    public static String getTimestamp(){
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strDate = sdf.format(date.getTime());
        long timeNr = date.getTime();
        timestamp = Long.toString(timeNr);
        return timestamp;
    }

    public static String getTimestamp2(){
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strDate = sdf.format(date.getTime());
        timestamp = sdf.format(date.getTime());
        return timestamp;
    }

}
