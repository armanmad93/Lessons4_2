package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson4_2_6 {

    public static void main(String[] args) {

        //4.2.6
        //Create a matrix with dimensions 5x5
        //initialize with random ints in range 10 - 99
        //print it
        //Display a menu
        //———————- MENU —————-
        //For rotating 90*
        //For rotating 180*
        //For rotating 270*
        //For Exit
        //————————————————
        //In any other case than 4 programm should NOT stop !!!

        int[][] array = new int[5][5];


        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        //initialize
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(89) + 10;
            }
        }

        //print
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        //Menu
        System.out.println();
        System.out.println("———————- MENU —————-");
        System.out.println("1: For rotating 90* input ");
        System.out.println("2: For rotating 180* input ");
        System.out.println("3: For rotating 270* input ");
        System.out.println("4: For Exit");
        System.out.println("————————————————");
        System.out.println();

        System.out.print("plz input number: ");

        //menu logic
        while (true) {
            int userNumber = scanner.nextInt();

            switch (userNumber) {
                case 1 -> {
                    System.out.println("rotating 90*");
                    System.out.println();
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            System.out.print(array[array.length - 1 - j][i] + " ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("rotating 180*");
                    System.out.println();
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[i].length; j++) {
                            System.out.print(array[array.length - 1 - i][array[i].length - 1 - j] + " ");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("rotating 270*");
                    System.out.println();
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array.length; j++) {
                            System.out.print(array[j][array.length - 1 - i] + " ");
                        }
                        System.out.println();
                    }
                }
                case 4 -> System.out.println("EXIT!!");
                default -> System.out.println("try again!");
            }
            if (userNumber > 0 && userNumber < 5) {
                break;
            }
        }

    }
}
