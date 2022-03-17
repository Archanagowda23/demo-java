package com.bridgelabz.demojava;

import java.util.Scanner;

public class PatternProgram {

    public void squarePattern() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }
        public static void main (String[]args){
            System.out.println("Welcome to pattern program");
            System.out.println("added square pattern");
            PatternProgram object = new PatternProgram();
            object.squarePattern();
        }
    }
