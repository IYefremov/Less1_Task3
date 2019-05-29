//3. Create a program which calculates square of a rectangle.
//        1) Create 2 different int variables for width and length (a and b).
//        2) Create 3rd varible and assign the result of the multiplication of a and b.
//        3) Print the result to the console.


package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enterInt = new Scanner(System.in);

        System.out.print("Enter the width: ");
        int width = enterInt.nextInt();

        System.out.print("Enter the length: ");
        int length = enterInt.nextInt();

        System.out.println("The square of the rectangle is " + length * width);

        enterInt.close();
    }
}
