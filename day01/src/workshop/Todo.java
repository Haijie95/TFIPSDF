package src.workshop;

public class Todo {
    public static void main(String[] args) {
        //array
        //create an array of 3 string element
        String[] tasks = new String[4];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";
        tasks[3] = "napping";

        //System.out.println(tasks); this will get a not proper value -> [Ljava.lang.String;@2c7b84de
        System.out.println(tasks[0]); //running
        System.out.println(tasks[1]); //eating
        System.out.println(tasks[2]); //sleeping
        System.out.println(tasks[3]); //napping
        System.out.println(tasks.length); //return the size of the array, in this case 4

        /* block comment */

        //Use a while loop to print out
        Integer count = 0;
        while (count < tasks.length) {
            System.out.printf("%d: %s\n", count, tasks[count]);
            count++;
        }
    }
}
