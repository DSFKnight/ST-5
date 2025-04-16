package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final double DELTA = 0.00000001;

    @Test
    public void testConstructor() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(4.0, sqrt.arg, DELTA);
    }

    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
    }

    @Test
    public void testGoodTrue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodFalse() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(3.0, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.5, sqrt.improve(1.0, 2.0), DELTA);
    }

    @Test
    public void testIterGood() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), DELTA);
    }

    @Test
    public void testIterImprove() {
        Sqrt sqrt = new Sqrt(2.0);
        double result = sqrt.iter(1.0, 2.0);
        assertTrue(Math.abs(result * result - 2.0) < DELTA);
    }

    @Test
    public void testCalcSimple() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcIrrational() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testSqrtOfNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }
}