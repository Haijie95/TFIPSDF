package src.workshop.main;

import src.workshop.cart.Apple;
import src.workshop.cart.Item;
import src.workshop.cart.Orange;

public class Main {
    public static void main(String[] args){
        //Item apple = new Item("apple","Apple");
        //Item orange = new Item("orange","Orange");

        //apple.setPrice(.5f);
        //apple.setQuantity(10);

        //orange.setPrice(.5f);
        //orange.setQuantity(10);

        Apple apple=new Apple();
        apple.setType("washington");

        Item orange=new Orange();
        System.out.printf("Apple code: %s\n", apple.getCode());
        System.out.printf("Orange code: %s\n", orange.getCode());

        Item item=apple;
        System.out.printf("Item code: %s\n",apple.getCode());

        Apple washinton = (Apple)item;
        System.out.printf("Washinton code: %s\n", washinton.getCode());

        System.out.printf("Is item an Orange? %b\n", item instanceof Orange);
        if (item instanceof Orange)
            orange=(Orange)item;

        //javac -sourcepath src -d classes src/prog/Main.java
        //java -cp classes prog.Main
    }
}
