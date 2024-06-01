package src.workshop;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class TodoList {
    public static void main(String[] args){

        //Create a list of numbers
        List<Integer> listOfInt=new LinkedList<>();

        //Get the console
        Console cons=System.console();

        String item="";

        while(true){
            item=cons.readLine("Please enter a number: ");
            item=item.trim();

            if(item.equals("stop")){ //if("stop".equals(item)) same meaning
                break;
            }

            //Add the item to the list
            listOfInt.add(Integer.parseInt(item));


        }

        System.out.printf("\nNumber of elements in the list: %d\n",listOfInt.size());
        for (Integer index=0; index<listOfInt.size();index++){ //(start;end;step)
            System.out.printf("[%d]: %s\n",index,listOfInt.get(index));
        }

        /*
        Integer index=0;
        while(index<listOfInt.size()){
            System.out.println(listOfInt.get(i));
            i++;
        }
         */

        //javac -sourcepath src -d classes src/myapp/*.java
        //java -cp classes myapp.TodoList
    }
}
