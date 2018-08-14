package com.arturmaks.clock_tree.api;

public class ClockAngle {

    public double countAngle(int hours, int minutes) {

        if (hours == 12) {
            hours = 0;
        }
        if (minutes == 60) {
            minutes = 0;
        }
        double hourAngle = 0.5 * (hours * 60 + minutes);
        double minutesAngle = 6 * minutes;

        double angle = Math.abs(hourAngle - minutesAngle);
        angle = Math.min(360 - angle, angle);
        System.out.println(angle);

        return angle;
    }
}