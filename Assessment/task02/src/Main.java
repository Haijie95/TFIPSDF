package task02.src;

import java.util.Scanner;

public class Main {

    private static Float lastNum=0f;
    

    public static void main(String[] args) {
        
        
        System.out.println("Welcome");
        while(true){
            Float total=0f;
            Scanner sc = new Scanner(System.in);
            String equation=sc.nextLine();
            
            if (equation.equalsIgnoreCase("exit")){
                System.out.println("Bye Bye");
                break;
            }
            String[] numAOp=equation.split(" ");
            
            for(Integer i=0;i<numAOp.length;i++){
                if(numAOp[i].equals("$last")){
                    numAOp[i]=Float.toString(lastNum);
                }
            }

            if (numAOp[1].equals("+")){
                total=Float.parseFloat(numAOp[0])+Float.parseFloat(numAOp[2]);
            } else if (numAOp[1].equals("-")){
                total=Float.parseFloat(numAOp[0])-Float.parseFloat(numAOp[2]);
            }else if (numAOp[1].equals("/")){
                total=Float.parseFloat(numAOp[0])/Float.parseFloat(numAOp[2]);
            }else if (numAOp[1].equals("*")){
                total=Float.parseFloat(numAOp[0])*Float.parseFloat(numAOp[2]);
            }

            System.out.println(total);
            lastNum=total;
            

        }
    }
}
