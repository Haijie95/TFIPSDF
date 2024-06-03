package practice.src;

import java.util.List;

public class Lambda {
    public static void apply(Greetings greetings,String value) {
        greetings.hello(value);
    }

    public static void toUpperCase(String str) {
        System.out.printf("%s -> %s\n",str,str.toUpperCase());
    }

    public static void main(String[] args) {
        //created a function type Greetings
        Greetings hi=(n)->{
            System.out.printf("Hello %s\n",n);
        };

        hi.hello("fred");

        List<String> names=List.of("Fred","Jemma","Wilson","Betty");
        System.out.printf("Say hello to %s\n",names);
        for (String n:names){
            apply(hi,n);
        }
        toUpperCase("hello, world");

        Greetings reverseCase=Lambda::toUpperCase;

        for (String n:names){
            apply(reverseCase,n);
        }
    }
}
