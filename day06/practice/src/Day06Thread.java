package practice.src;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {
    public static void main(String[] args) {

        List<Integer> numList=new LinkedList<>();

        ExecutorService threadpool= Executors.newFixedThreadPool(2);

        for(Integer i=0;i<3;i++){
            //create a thread
            RandomNumbers thr = new RandomNumbers("thr-%d".formatted(i), 100,numList);
            //schedule a thread to the runnable
            threadpool.submit(thr);
        }

        System.out.println("All done");
        while(true){
            System.out.println("\n>>> numList: "+numList+", size: "+numList.size());
            try{
                //sleep for 5s
                Thread.sleep(5*1000);
            }
            catch(InterruptedException ex){

            }

        }
    }
}
