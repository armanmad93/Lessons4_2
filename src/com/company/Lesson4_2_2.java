package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson4_2_2 {

    public static void main(String[] args) {

        //4.2.2
        //Create a matrix with dimensions 10x15
        //initialize with random ints in range 10 - 99
        //print it
        //Get the row number from the console - row number
        //Print the sum of the elements in row row number of that matrix

        int[][] array = new int[10][15];
        int userNumber;
        int sum = 0;

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        //initialize
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(89) + 10;
            }
        }

        //print
        System.out.println("Matrix");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("plz input row number: ");

        //Get the row number from the console
        while (true) {
            userNumber = scanner.nextInt();
            if (userNumber > 0 && userNumber <= array.length) {
                break;
            }
            System.out.print("try again! ");
        }

        //get sum row number
        for (int i = 0; i < array[array.length - 1].length; i++) {
            sum += array[userNumber - 1][i];
        }

        System.out.println();
        System.out.print("sum of the elements in row row number of that matrix: " + sum);

    }
}
