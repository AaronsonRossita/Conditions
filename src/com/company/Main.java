package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        int x = scanner.nextInt();
//        System.out.println("Pls write the first number");
//        int a = scanner.nextInt();
//        System.out.println("Pls write the second number");
//        int b = scanner.nextInt();
//       firstOneLarger();
//
//       while (x < 10){
//           System.out.println("hey");
//           x++;
//       }
        int x = random.nextInt(5);
        guess(x);
    }

    static void firstOneLarger (int a, int b){
        if (a > b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static void firstOneLarger (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls write the first number");
        int a = scanner.nextInt();
        System.out.println("Pls write the second number");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static void guess(int x){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Try to guess the number");
        int answer = scanner.nextInt();
        int counter = 1;
        while (answer != x){
            System.out.println("Try again");
            answer = scanner.nextInt();
            counter++;
        }
        System.out.println("Mazal tov !");
        System.out.println("Guesses : " + counter);
    }
}
