package basics_all;

import java.util.Scanner;

public class input_console {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter any word: ");
        String word = sc.next();
        System.out.println("You entered the word: "+ word);
        System.out.println("Please, enter any integer: ");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        float f = sc.nextFloat();
        System.out.println("You entered the number: " + i);
    }
}