package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextDouble(0, 100);
            System.out.print(arr[i] + " ");
        }

        double value = scanner.nextDouble();
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                found = true;
                System.out.println("Value = " + arr[i] + " Index = " + i);
            }
        }

        if(!found){
            System.out.println("An array doesnt contains value " + value);
        }
    }
}
