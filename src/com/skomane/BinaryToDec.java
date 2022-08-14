package com.skomane;

import java.util.Scanner;

public class BinaryToDec {
    public void convertBinToDec() {
        int binary;
        int decimal = 0;
        int i = 1;
        int rem;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Binary Number: ");
            binary = input.nextInt();
        }

        while (binary != 0) {
            rem = binary % 10;
            decimal = decimal + (rem * i);
            i = i * 2;
            binary = binary / 10;
        }

        System.out.print("\nDecimal Equivalent Value = " + decimal);
    }
}
