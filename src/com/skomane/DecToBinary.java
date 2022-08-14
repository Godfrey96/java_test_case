package com.skomane;

import java.util.Scanner;

public class DecToBinary {
    public void convertDecToBin(){
//        int[] binary = new int[20];
//        int index = 0;
//        int n;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the Decimal Number");
//        n = input.nextInt();
//
//        while(n != 0){
//            binary[index++] = n % 2;
//            index++;
//            n = n / 2;
//        }
//
//        for (int i = (index - 1); i >= 0; i++){
//            System.out.print(binary[i]);
//        }

        int num;
        int index = 0;
        int[] binary = new int[10000];

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Decimal Number: ");
        num = scan.nextInt();

        while(num != 0)
        {
            binary[index] = num % 2;
            index++;
            num = num / 2;
        }

        System.out.print("\nBinary Equivalent Value = ");

        for(index = (index - 1); index >= 0; index--)
            System.out.print(binary[index]);

//        System.out.print("Binary Equivalent value = " + n);
    }
}
