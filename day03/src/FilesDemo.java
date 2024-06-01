package src;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

    public static void main(String[] args) {
        String filepath="src/demo.txt";
        ReadFile(filepath); //read from the path above
        String filepath2="src/demo2.txt";
        WriteFile(filepath2);//write from the path above
    }

    //ctrl to click to method
    public static void ReadFile(String fname){
        //Path Obj
        Path pth= Paths.get(fname); //making a path from string
        File fobj=pth.toFile(); //pointing to the file from the path

        //File Obj
        if(fobj.exists()){ //check if the file exist
            System.out.println(("File Exists!"));
        } else{
            System.out.println("File Not Found!");
        }

        //Reader Obj
        try{
            FileReader fr = new FileReader(fobj);
            BufferedReader bdf = new BufferedReader(fr);

            //String line=bdf.readLine();
            //System.out.println("First Line => "+line);
            String line;

            while(null!=(line=bdf.readLine())){
                System.out.println("> "+line);
            }

            bdf.close();
        }
        catch (FileNotFoundException e){
            System.out.println("File Not Found. Please Check Input!");
        }
        catch (IOException e){
            System.out.println("Unable to read lines: "+e.getMessage());
        }

    }
    public static void WriteFile(String fname){
        try{
            FileWriter fw = new FileWriter(fname, false);
            //fw.write("apples\n");
            //fw.write("orange\n");
            //fw.write("pear\n");

            BufferedWriter bfw = new BufferedWriter(fw);
            bfw.write("apples\n");
            bfw.write("orange\n");
            bfw.write("pear\n");

            bfw.flush(); //make sure changes are saved before closing
            bfw.close();

            //ALWAYS REMEMBER TO FLUSH THE RIGHT THING
            //fw.flush(); //make sure changes are saved before closing
            //fw.close();
        }
        catch(Exception e) {
            System.out.println("Unable to write line: "+e);
        }
    }
}
