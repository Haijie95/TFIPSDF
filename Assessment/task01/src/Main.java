package task01.src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {

    private static String line="";
    private static Map<String, String> allParameters=new HashMap<>();

    public static void main(String[] args) {
        

        // java -cp classes your.package.Main <csv file>
        if (args.length <= 0) {
            System.out.println("Missing csv file name and template file name");
            System.exit(1);
        } else if (args.length == 1) {
            System.out.println("One file name missing try again!");
            System.exit(1);
        }
        // create a file object
        //System.out.println(args[0]);

        ProcessTheFile newfile = new ProcessTheFile(args[0].trim()); // index 0 is csv file
        newfile.start();
        
       

        try {
            String[] para1 = newfile.getParameter1().split(" ");
            String[] para2 = newfile.getParameter2().split(" ");
            String[] para3 = newfile.getParameter3().split(" ");
            String[] para4 = newfile.getParameter4().split(" ");
            
            for(int i =0;i<para1.length;i++){
                allParameters.put(para1[0], allParameters.get(para1[0])+" "+para1[i]);
                allParameters.put(para2[0], allParameters.get(para2[0])+" "+para2[i]);
                allParameters.put(para3[0], allParameters.get(para3[0])+" "+para3[i]);
                allParameters.put(para4[0], allParameters.get(para4[0])+" "+para4[i]);
            }
            System.out.println(allParameters);
            
            Set<String> keys = allParameters.keySet();

            Reader r = new FileReader(args[1]); // index 1 is txt file
            BufferedReader br = new BufferedReader(r);
            Integer n=0;
            String newline="";
            while((line=br.readLine())!=null){
                for(String eachkey:keys){
                    if(line.contains("<<%s>>".formatted(eachkey))){ //check for key word
                        newline=line.replace("<<%s>>".formatted(eachkey), allParameters.get(eachkey).split(" ")[n+1].toString()); //replace
                    }
                }
                System.out.println(newline);
                n++;
            }
                
        } catch (IOException e) {
            System.out.println("File not found!");
        }

        

    }

}