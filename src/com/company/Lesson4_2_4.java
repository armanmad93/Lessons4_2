package com.company;

import java.util.Random;

public class Lesson4_2_4 {

    public static void main(String[] args) {

        //4.2.4
        //Create a matrix with dimensions 10x15
        //initialize with random ints in range 10 - 99
        //print it
        //Rotate it in 180* clockwise

        int[][] array = new int[10][15];

        Random random = new Random();

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

        System.out.println();
        System.out.println("new matrix");
        System.out.println();

        //rotate 180*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[array.length - 1 - i][array[i].length - 1 - j] + " ");
            }
            System.out.println();
        }

    }
}
