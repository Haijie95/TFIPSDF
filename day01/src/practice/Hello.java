package src.practice;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {
        //javac -sourcepath src -d classes/ src/practice/*.java src/practice/*.java

        //Get system console
        Console cons = System.console();

        //Read from the console, the result is assigned to a variable
        String name = cons.readLine("What is your name? ");

        //Send a greeting to the name
        if(name.trim().equals("Fred")){
            // == comparison is only for numbers/values
            // For string, we use equal()
            // trim() removes white spaces before and after the string
            System.out.println("Yaba Yaba Doo~~~\n");
        } else if (name.trim().equals("hj")) {
            System.out.printf("Hello %s, Welcome back!\n",name.trim().toLowerCase());
            // Lowercase to make all uncap
        } else if (name.trim().equals("")){ //.isEmpty() or .length()==0
            System.err.println("Please Type Your name");
        } else {
            //printf allows formatting like in python %something
            System.out.printf("Hello %s. Nice to make your acquaintance!\n",name.trim().toLowerCase()); //To make all uncap
        }

    }
}