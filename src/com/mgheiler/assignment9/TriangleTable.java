package com.mgheiler.assignment9;

public class TriangleTable {

    public static void printTriangleTableWithSize(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(i);
            for (int j = size - 1; j >= 0; j--) {
                if (j < i) {
                    System.out.print(" " + j);
                }
            }
            System.out.print("\n");
        }
    }

    public static void printTriangleTableBetween(int a, int b) {
        // User will give the size, starting from 1. Take this into account
        a = a - 1;
        b = b - 1;
        for (int i = a; i <= b + 1; i++) { // Take into account the initial increment of i by increasing b to b + 1
            printTriangleTableWithSize(i);
        }
    }

}
