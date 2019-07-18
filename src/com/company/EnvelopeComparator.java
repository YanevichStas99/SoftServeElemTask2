package com.company;

import java.util.Scanner;

public class EnvelopeComparator {
    public String possibility() {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d;
        System.out.println("Enter side 'a' of 1 envelope:");
        a = scanner.nextDouble();
        System.out.println("Enter side 'b' of 1 envelope:");
        b = scanner.nextDouble();
        System.out.println("Enter side 'c' of 2 envelope:");
        c = scanner.nextDouble();
        System.out.println("Enter side 'd' of 2 envelope:");
        d = scanner.nextDouble();
        if (comare(a,b,c,d)){
            return "Possible";
        }else {
            return "Not possible";
        }
    }

    private boolean comare(double a, double b, double c, double d) {
        return (a > c && b > d) || (c > a && d > b);
    }
}
