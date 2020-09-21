package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int x1, x2, y1, y2, SumX, SumY;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First X Coordinate");
        x1 = sc.nextInt();
        System.out.println("Enter First Y Coordinate");
        y1 = sc.nextInt();
        System.out.println("Enter second X coordinate");
        x2 = sc.nextInt();
        System.out.println("Enter second Y Coordinate");
        y2 = sc.nextInt();

        sc.close();
        SumX = x2 - x1;
        SumY = y2 - y1;
        if (SumX == SumY){
            System.out.println("The slope is 1");
        }
        else {
            System.out.print("The slope is"+SumY+"/"+SumX);
        }
    }
}