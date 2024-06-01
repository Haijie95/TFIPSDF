package src;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        System.out.println(("Array List Demo"));

        //create an array list object
        ArrayList<String> mylist=new ArrayList<String>();

        //Add items to it
        mylist.add("Apple");
        mylist.add("Orange");
        //Loop over and print the items
        for(String item: mylist){
            System.out.println("Item-> "+item);
        }

        //remove apples from this list
        mylist.remove("Apple");

        //print the no of items inside the list
        int count =mylist.size();
        System.out.println(count);

        //Hashmap<key,value> var = new Hashmap<key,value>();

    }
}
