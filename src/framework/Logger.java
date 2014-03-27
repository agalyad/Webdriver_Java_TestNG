package framework;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Logger 
{
    public static void log(String text)
    {
         Date d = new Date();
        
         DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
         String timestamp = df.format(d);
                
         System.out.println("[" + timestamp + "] " + text);
    }
    
    public static void info(String text)
    {
        log("INFO:" + text);
    }
    
    public static void error(String text)
    {
        log("ERROR:" + text);
    }
}