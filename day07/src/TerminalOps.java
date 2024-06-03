package src;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        Integer max=100;
        Integer range=100;
        Random rnd = new SecureRandom();

        List<Integer> numList=new LinkedList<>();
        for (Integer i=0;i<max;i++){
            numList.add(rnd.nextInt(range));
        }

        System.out.println(">>> numList: "+numList);

        //joining(numList);
        //reducing(numList);
        //joiningAsReducing(numList);
        reducing2(numList);
    }

    public static void joiningAsReducing(List<Integer> numList){
        System.out.println("================Joining===============");

        Optional<String> opt = numList.stream()
        .map(n->"%d%d".formatted(n,n))
        .collect(Collectors.reducing((total,i) ->{
            System.out.printf("Total: %s i: %d",total,i);
            return "%s, %s".formatted(total,i);
        }));

        if(opt.isPresent()){
            //get the answer
            System.out.println(">>> Reducing: "+opt.get());
        } else{
            System.out.println("Reducing produces no result!");
        }

    }

    public static void joining(List<Integer> numList){
    
        System.out.println("================Joining===============");

        String listOfNums = numList.stream()
        .map(n->"%d%d".formatted(n,n))
        .collect(Collectors.joining(","));

        System.out.println(">>> Joining: "+listOfNums);
    }
    public static void reducing(List<Integer> numList){
    
        System.out.println("================Reducing===============");

        Optional<Integer> opt = numList.stream()  //optional mean returning a box, may or may not contain an answer
        .map(n->"%d%d".formatted(n,n))
        .map(Integer::parseInt)
        .collect(Collectors.reducing((total,i) -> {   //give u 2 parameter
            System.out.printf("Total: %d Num: %d\n",total,i);
            return total+i;                           //let u decide what to do to get a single value
        }));

        if(opt.isPresent()){
            //get the answer
            System.out.println(">>> Reducing: "+opt.get());
        } else{
            System.out.println("Reducing produces no result!");
        }
    }

    public static void reducing2(List<Integer> numList){
    
        System.out.println("================Reducing2===============");

        Integer opt = numList.stream()  //optional mean returning a box, may or may not contain an answer
        .map(n->"%d%d".formatted(n,n))
        .map(Integer::parseInt)
        .collect(Collectors.reducing(0,(total,i) -> {   //give u 2 parameter
            System.out.printf("Total: %d Num: %d\n",total,i);
            return total+i;                           //let u decide what to do to get a single value
        }));
    }
}
