package com.conditinalloop;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {

        /*
         * 1 --> mon
         * 2 --> tue
         * 3 --> wed
         * 4 --> thu
         * 5 --> fri
         * 6 --> sat
         * 7 --> sun
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value:");
        int userinput = sc.nextInt();

        switch (userinput) {

            case 1: {
                System.out.println("mon");
                break;
            }

            case 2: {
                System.out.println("tue");
                break;
            }

            case 3: {
                System.out.println("wed");
                break;
            }

            case 4: {
                System.out.println("thu");
                break;
            }

            case 5: {
                System.out.println("fri");
                break;
            }

            case 6: {
                System.out.println("sat");
                break;
            }

            case 7: {
                System.out.println("sun");
                break;
            }

            default: {
                System.out.println("Invalid please try again!!!");
            }
        }

        
    }
}