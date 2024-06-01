package src;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args){

        HashMap<String, ArrayList<String>> usermap=new HashMap<String,ArrayList<String>>();
        usermap.put("Apple",new ArrayList<String>());
        usermap.put("Orange",new ArrayList<String>());
        usermap.put("Pear",new ArrayList<String>());

        //key/value type
        //string/integer

        HashMap<String,Integer> mymap = new HashMap<String,Integer>();

        //add a key value pair to it
        mymap.put("Bala", 30);
        mymap.put("John", 40);
        System.out.println("Value for key = "+mymap.get("Bala"));

        System.out.println(mymap.get("Bala"));

        mymap.put("Bala", 31);
        System.out.println("New Value for key = "+mymap.get("Bala"));



    }
}
