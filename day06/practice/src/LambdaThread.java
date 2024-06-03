package practice.src;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaThread {
    public static void main(String[] args) {

        ExecutorService thrpool= Executors.newFixedThreadPool(2);
        //control the number of thread running at a time
        for(Integer i=0;i<3;i++){
            thrpool.submit(
                    //runnable - public void run
                    ()->{
                        Random rnd = new SecureRandom();
                        for(Integer j=0; j<10;j++)
                            System.out.printf("Random: %d\n",rnd.nextInt(100));
                    }
            );
        }

    }
}
