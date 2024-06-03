package src;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class IntList{


    public static void main(String[] args, boolean Integer) {
        //randomly generate a list of numbers
        Integer max=100;
        Integer range=100;
        Random rnd = new SecureRandom();

        List<Integer> numList=new LinkedList<>();
        for (Integer i=0;i<max;i++){
            numList.add(rnd.nextInt(range));
        }

        System.out.println(">>> numList: "+numList);

        map(numList);
    }
    public static void main(List<Integer> numList){

        System.out.println("============Filter=============");

        //filter
        List<Integer> resultList= new LinkedList<>();
        for(Integer n: numList){
            if(0!=(n%3))
                continue;
            resultList.add(n);
        }
        System.out.println(">>> resultList: "+resultList);


        //predicate in this casee take in integer and give a boolean
        //boolean test(Integer i)
        resultList = numList.stream().filter((n) -> { // ((n) -> 0!=(n%3)) inthis case cause 1 line can be shorten to this form
            return 0==(n%3);
        })
        .distinct()
        .sorted()
        .limit(5)
        .toList();
        System.out.println(">>> stream resultList: "+resultList);

    }
    public static void map(List<Integer> numList){

        System.out.println("============Map=============");

        //filter
        List<Integer> resultList= new LinkedList<>();
        for(Integer n: numList){
            if(0==(n%3))
            resultList.add(n);
        }
        System.out.println(">>> resultList: "+resultList);

        List<Integer> intList = numList.stream().map(n -> "%d%d".formatted(n,n)).map(Integer::parseInt).toList();
        System.out.println(">>> str and double"+intList);
    }

}