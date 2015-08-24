package config;

public class scriptLoader {
    public static String JS=null;
    public static String Py=null;
    public static String getScript(String engine){
        if(engine.equals("JavaScript")){
            if(JS==null) load();
            return JS;
        }        
        return "";
    }
    private static void load(){
        JS=misc.readTextFromJar("/config/scriptInit.js");
    }
}
