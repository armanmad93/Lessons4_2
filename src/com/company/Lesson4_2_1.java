package com.company;

import java.util.Random;

public class Lesson4_2_1 {

    public static void main(String[] args) {

        //4.2.1
        //Create a matrix with dimensions 10x15
        //initialize with random ints in range 10 - 99
        //print it
        //find and print the minimum value

        int[][] array = new int[10][15];

        Random random = new Random();

        //initialize
        System.out.println("Matrix: ");
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

        System.out.println();

        int minimum = array[0][0];

        // find minimum value
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (minimum > array[i][j]) {
                    minimum = array[i][j];
                }
            }
        }

        System.out.print("minimum value: " + minimum);

    }
}
