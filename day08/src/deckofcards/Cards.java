package src.deckofcards;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Cards{

    public static void main(String[] args) {
        
    
        try {
            List<String> lines = Files.readAllLines(Paths.get("Deck.txt"));
            while(true){
                Scanner sc = new Scanner(System.in);
                String input= sc.nextLine();
                String[] commandnNum = input.split(" "); 
                String commands=commandnNum[0];
                Integer times=Integer.parseInt(commandnNum[1]);

                if(commands.equalsIgnoreCase("draw")){
                    for(Integer i=0;i<times;i++){
                        String card=drawCard(lines);
                    System.out.println(card);
                    }
                    
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            
    }

    public static String drawCard(List<String> lines) {
        Collections.shuffle(lines);
        return lines.get(0);
    }

    

 
}