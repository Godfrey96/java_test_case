package com.skomane;

import java.util.Scanner;

public class decToHex {

    public void convertDecToHex(){
        int rem;
        String hex = "";
        char[] hexDigit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Decimal Number");
        int n = input.nextInt();

        while(n > 0 && n <= 10000){
            if (n > 10000){
                System.out.println("Number is out of boundary");
            }else{
                rem = n % 16;
                hex = hexDigit[rem] + hex;
                n = n / 16;
            }

        }

        System.out.println("Hexadecimal Equivalent value = " + hex);
    }
}
