package com.greatlearning.Question1.Drivers;

import com.greatlearning.Question1.Services.Skyscraper;

import java.util.Scanner;

public class AssembleFloorsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total no of floors in the building : ");
        int NumberOfFloors = sc.nextInt();
        Skyscraper.AssembleFloors(NumberOfFloors);

        }
    }

    /*OUTPUT :
Enter the total no of floors in the building :
10
Enter the floor size given on day : 1
1
Enter the floor size given on day : 2
2
Enter the floor size given on day : 3
3
Enter the floor size given on day : 4
8
Enter the floor size given on day : 5
9
Enter the floor size given on day : 6
10
Enter the floor size given on day : 7
4
Enter the floor size given on day : 8
5
Enter the floor size given on day : 9
7
Enter the floor size given on day : 10
6
The order of construction is as follows :
Day 1 :
Day 2 :
Day 3 :
Day 4 :
Day 5 :
Day 6 :
10 9 8
Day 7 :
Day 8 :
Day 9 :
7
Day 10 :
6 5 4 3 2 1

Process finished with exit code 0*/
