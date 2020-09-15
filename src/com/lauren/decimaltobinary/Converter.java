package com.lauren.decimaltobinary;

import java.util.Scanner;


public class Converter {
    public static void main(String[]args) {

        System.out.println("Enter number:");

        Scanner inputScanner = new Scanner(System.in);
        String input = inputScanner.nextLine();

        int decimal = Integer.parseInt(input);


        int divisor = 2;
        int quotient = 9999;
        String answer = "";

        while(quotient != 0){
            int remainder = decimal % divisor;
            quotient = decimal / divisor;
            decimal = quotient;
            answer = answer + remainder;
        }

        for (int i = answer.length() - 1; i >= 0; i--) {
            System.out.print(answer.charAt(i));
        }
    }
}
