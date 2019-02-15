package w2d4.examples;

import java.util.Scanner;

public class AskInputAndCheckAge {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Give your age: ");
        System.out.println(input.nextInt());
        while (!input.hasNextInt()) {
            System.out.println("Please enter a number:");
            input.next();
        }
        input.nextInt();
        System.out.println("Enter your age again");
        age = input.nextInt();
        System.out.println("Your age is "+age);
    }

}
