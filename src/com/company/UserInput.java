package com.company;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
	// write your code here
        int number1;
        int number2;

        String name;

        Scanner input = new Scanner(System.in);

        System.out.print(" Please enter your name >> ");
        name = input.nextLine();

        System.out.print(" Please enter a number >> ");
        number1 = input.nextInt();

        System.out.print(" Please enter another number >> ");
        number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println(" Hello " + name);
        System.out.println(" The answer is: " + sum);
    }

}
