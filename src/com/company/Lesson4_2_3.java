package com.company;

import java.util.Random;

public class Lesson4_2_3 {

    public static void main(String[] args) {

        //4.2.3
        //Create a matrix with dimensions 10x15
        //initialize with random ints in range 10 - 99
        //print it
        //Rotate it in 90* clockwise

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

        System.out.println("new matrix:");

        int internalArrayLenght = array[0].length;

        //Rotate it in 90*
        for (int i = 0; i < internalArrayLenght; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[array.length - 1 - j][i] + " ");
            }
            System.out.println();
        }

    }
}
