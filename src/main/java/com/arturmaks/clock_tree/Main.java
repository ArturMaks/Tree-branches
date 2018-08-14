package com.arturmaks.clock_tree;

import com.arturmaks.clock_tree.api.ClockAngle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        runCountAngle();
    }

    private static void runCountAngle() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter hours from 0 to 12");
        int hours = scan.nextInt();
        if (hours < 0 || hours > 12) {
            throw new RuntimeException("Not a correct number of hours");
        }
        System.out.println("Please enter minutes from 0 to 60");
        int minutes = scan.nextInt();
        if (minutes < 0 || minutes > 60) {
            throw new RuntimeException("Not a correct number of minutes");
        }

        ClockAngle ca = new ClockAngle();
        ca.countAngle(hours, minutes);
        scan.close();
    }
}
