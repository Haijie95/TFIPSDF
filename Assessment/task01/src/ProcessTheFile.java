package task01.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public class ProcessTheFile {

    private String fileName;
    private String parameter1="";
    private String parameter2="";
    private String parameter3="";
    private String parameter4="";
    private Map<String,String> allParameters= new HashMap<>();

    //constructor
    public ProcessTheFile(String fileName) {
        this.fileName = fileName;
    }

    //getter
    public String getParameter1() {
        return parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public String getParameter3() {
        return parameter3;
    }

    public String getParameter4() {
        return parameter4;
    }
    

    public void start() {

        try {
            Reader r = new FileReader(fileName);
            BufferedReader br = new BufferedReader(r);
            
            String line;
            Integer count=0;
            while (null != (line = br.readLine())) {
                String[] info = line.trim().split(",");
                if(count==0){
                    parameter1=info[0];
                    parameter2=info[1];
                    parameter3=info[2];
                    parameter4=info[3];
                } else{
                    parameter1=parameter1+"  "+info[0];
                    parameter2=parameter2+"  "+info[1];
                    parameter3=parameter3+"  "+info[2];
                    parameter4=parameter4+"  "+info[3];
                }
                count++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

}
