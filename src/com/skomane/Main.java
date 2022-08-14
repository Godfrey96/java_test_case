package com.skomane;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nCHOOSE OPTIONS BELOW");
        System.out.println(" ");
        System.out.print("1 - Convert Decimal to Hexadecimal: ");
//        System.out.print("\n2 - Convert Hexadecimal to Decimal: ");
        System.out.print("\n2 - Convert Decimal to Binary: ");
        System.out.print("\n3 - Convert Binary to Decimal: ");
        System.out.print("\n0 - To Exit ");
        System.out.println(" ");

        Scanner input = new Scanner(System.in);

        int selection = input.nextInt();

        switch (selection){
            case 1:
                decToHex obj = new decToHex();
                obj.convertDecToHex();
                break;
//            case 2:
//                HexToDecimal decObj = new HexToDecimal();
//                decObj.convertHexToDec();
//                break;
            case 2:
                DecToBinary binObj = new DecToBinary();
                binObj.convertDecToBin();
                break;
            case 3:
                BinaryToDec conDecObj = new BinaryToDec();
                conDecObj.convertBinToDec();
                break;
            case 0:
                System.out.println("Thank you for using our Conversion Calculator. BYE!");
                break;
            default:
                System.out.println("Invalid Option");
        }

    }
}
