package com.skomane;

import java.util.Scanner;

public class DecToBinary {
    public void convertDecToBin() {

        int num;
        int index = 0;
        int[] binary = new int[10000];

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the Decimal Number: ");
            num = scan.nextInt();
        }

        while (num != 0) {
            binary[index] = num % 2;
            index++;
            num = num / 2;
        }

        System.out.print("\nBinary Equivalent Value = ");

        for (index = (index - 1); index >= 0; index--) {
            System.out.print(binary[index]);
        }
    }
}
