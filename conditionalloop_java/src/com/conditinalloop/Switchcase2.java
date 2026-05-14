package com.conditinalloop;

import java.util.Scanner;

public class Switchcase2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        int userinput = sc.nextInt();

        
        switch (userinput) {

            case 1, 2, 3, 4, 5: {
                System.out.println("weekday");
                break;
            }

            case 6, 7: {
                System.out.println("weekend");
                break;
            }

            default: {
                System.out.println("Invalid please try again!!!");
            }
        }

  
        switch (userinput) {

            case 1, 2, 3, 4, 5 ->
                System.out.println("weekday");

            case 6, 7 ->
                System.out.println("weekend");

            default ->
                System.out.println("Invalid please try again!!!");
        }

        
    }
}