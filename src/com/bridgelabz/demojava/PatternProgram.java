package com.bridgelabz.demojava;

import java.util.Scanner;

public class PatternProgram {
    static Scanner scanner = new Scanner(System.in);
    public void squarePattern() {
        System.out.println("Enter no");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void triangleStar() {
        System.out.println("Enter row ");
        int row = scanner.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
        public static void main (String[]args){
            System.out.println("Welcome to pattern program");
            System.out.println("added square pattern");
            System.out.println("added triangle star pattern");
            PatternProgram object = new PatternProgram();
            object.squarePattern();
            object.triangleStar();
        }
    }
