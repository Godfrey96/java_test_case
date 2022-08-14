package com.skomane;

import java.util.Scanner;

public class HexToDecimal {
    public void convertHexToDec() {
        String hexString = "0123456789ABCDEF";
        int num = 0;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the Hexadecimal value");
            String hexnum = input.nextLine();
            hexnum = hexnum.toUpperCase();

            for (int i = 0; i < hexnum.length(); i++) {
                char ch = hexnum.charAt(i);
                int n = hexString.indexOf(ch);
                num = 16 * num + n;
            }
        }

        System.out.println("Decimal Equivalent value = " + num);

    }
}
