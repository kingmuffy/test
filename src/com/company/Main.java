package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] myArray = array(5);
        for (int i = 0; i<myArray.length; i++){
            System.out.println("the array value of " +i +" is " +myArray[i]);
        }



	// write your code here
        System.out.println("hello");
    }
    public static int [] array(int array) {
        int [] value = new int  [array];
        System.out.println("enter number");
        for (int i = 0; i<value.length; i++){
            value[i] = scanner.nextInt();
            System.out.println("value " +i+ " entered succesfuly");

        }
        return value;

    }
}
