package workshop.src;

import java.io.IOException;
import java.net.Socket;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MultiThread extends Thread {
    
    private Socket socket;
    //    private String request="";

    public MultiThread(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run(){
        Random rnd=new SecureRandom();
        while(true){
            try{
                String payload=IOUtils.read(socket);
                if(payload.equalsIgnoreCase("exit")){
                    System.err.println("Server Closing");
                    IOUtils.write(socket,payload);
                    break;
                }
                String[] values=payload.split(" ");

                Integer count=Integer.parseInt(values[0]);
                Integer range=Integer.parseInt(values[1]);
                
                List<Integer> randNums=new LinkedList<>();
                for(Integer i=0;i<count;i++){
                    randNums.add(rnd.nextInt(range));
                }

                String response= randNums.stream().map(v -> v.toString()).collect(Collectors.joining(":"));

                IOUtils.write(socket,response);
                
                
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
