package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 2");
        boolean choise = true;
        Scanner scanner = new Scanner(System.in);
        while (choise) {
            EnvelopeComparator comparator = new EnvelopeComparator();
            System.out.println(comparator.possibility());
            System.out.println("Do you want to continue?(Enter 'y' or 'yes' to continue)");
            String decision = scanner.nextLine();
            if (!decision.equals("y") && !decision.equals("yes")){
                choise = false;
                System.out.println("Program ended.");
            }
        }
    }
}
