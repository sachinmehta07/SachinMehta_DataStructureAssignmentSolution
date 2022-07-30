package com.greatlearning.Question1.Services;
import java.util.Scanner;
public class Skyscraper {
    public static void AssembleFloors(int NumberOfFloors){
        int[] x = new int[NumberOfFloors + 1];
        for (int i = 1; i < NumberOfFloors + 1; i++) {
            System.out.println("Enter the floor size given on day : " + i);
            Scanner sc = new Scanner(System.in);
            int FloorSize = sc.nextInt();
            x[FloorSize] = i;
        }
        int j = NumberOfFloors;
        boolean flag;
        System.out.println("The order of construction is as follows : ");
        for (int i = 1; i <= NumberOfFloors; i++) {
            flag = false;
            System.out.println("Day " + i + " :");
            while (j >= 1 && x[j] <= i) {
                flag = true;
                System.out.print(j + " ");
                j--;
            }
            if (flag) {
                System.out.println();
            }
        }
    }
}
