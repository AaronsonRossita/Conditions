package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

//                index           0 arr[i]             1                2             3
        String[][] arr = {{"abc","def","hij"},{"ABC","DEF","HIJ"},{"123","456"},{"#$%","^&*"}};
//                index     0     1     2
        String str = "abcdef";
//
//        System.out.println("Pls write the first number");
//        int first = scanner.nextInt();
//        System.out.println("Pls write the second number");
//        int second = scanner.nextInt();
//
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
//        int x = random.nextInt(5);
//        guess(x); arr[0][0].charAt(2)
//        if (first == second){
//            System.out.println("first equals second");
//        }
//
//        if (first != second){
//            System.out.println("first is not equal to second");
//        }
//
//        if (first > second){
//            System.out.println("first is larger than second");
//        }
//
//        if (first >= second){
//            System.out.println("first is larger or equal to second");
//        }
//
//        if (first < second){
//            System.out.println("second is larger than first");
//        }
//
//        if (first <= second){
//            System.out.println("second is larger or equal to first");
//        }
////                     AND
//        if (first == 5 && second == 6){
//            System.out.println("AND");
//        }
////                    OR
//        if (first > 4 || second > 4){
//            System.out.println("OR");
//        }
//
//
//        System.out.println(arr[4]);            //ArrayIndexOutOfBoundsException
//        System.out.println(str.charAt(6));     //StringIndexOutOfBoundsException
//        System.out.println(3/0);               //ArithmeticException
//
//        try {
//            System.out.println(arr[4]);
//        }catch (ArrayIndexOutOfBoundsException ex1){
//            System.out.println("this is the first catch " + ex1);
//        }catch (StringIndexOutOfBoundsException ex2){
//            System.out.println(ex2);
//        }catch (ArithmeticException ex3){
//            System.out.println(ex3);
//        }finally {
//            System.out.println("I happen anyway");
//        }

        System.out.println("Pls write a number");
        try {
            int x = scanner.nextInt();
        }catch (InputMismatchException ex1){
            System.out.println("I SAID NUMBER !");
        }

        System.out.println("mashu");

        try {
            printWeekday();
        }catch (Exception ex){
            System.out.println("don't know what happened but bye");
        }

        try{
            div();
        }catch (ArithmeticException ar){
            System.out.println("can't divide by zero");
        }catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println("ok");
    }

    static void div(){
        System.out.println("First number: ");
        int a = scanner.nextInt();
        System.out.println("Second number: ");
        int b = scanner.nextInt();
//        if (b == 0){
//            div();
//        }else{
//            System.out.println(a/b);
//        }
        System.out.println(a/b);
    }

    static void printSum(){
        int sum = 0; // +5 +5 +3
        System.out.println("Pls write the number to be added. \nTo stop write 0");
        int temp = scanner.nextInt();
        while (temp != 0){
            sum += temp; // sum = sum + temp   0 = 0 + 5 -> 5 = 5 + 5 -> 10 = 10 + 3
            System.out.println("Pls write the next number");
            temp = scanner.nextInt(); // temp = 5
        }
        System.out.println("Sum is " + sum);

//        int x = 0;
//        int temp = 0;
//        temp = 5;
//        x += temp; // x = x + 5;
//        temp = 3;
//        x += temp; // x = x + 3;
//        System.out.println(x);
    }

    static void printWeekday(){
        System.out.println("Pls write the day number");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Wrong number");
        }

    }

    static void printEverySymbol (String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    static void printEverySymbolSpace (String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    static void printEverySymbol (String[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length(); k++) {
                    System.out.println(arr[i][j].charAt(k));
                }
            }
        }
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
