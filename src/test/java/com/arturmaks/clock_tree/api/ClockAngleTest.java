package com.arturmaks.clock_tree.api;

import org.junit.Assert;
import org.junit.Test;

public class ClockAngleTest {
    private static final double FIRST_TEST = 7.5;

    @Test
    public void givenNewAngleCalculator_WhenEnter3and15_ThenReturnsAngleBetweenEqualsFIRST_TEST() {
        //given
        ClockAngle angleCalculator = new ClockAngle();
        //when
        double angle = angleCalculator.countAngle(3, 15);
        //then
        Assert.assertEquals("Angle should be 7.5", angle, FIRST_TEST, 0.01);

    }
}
