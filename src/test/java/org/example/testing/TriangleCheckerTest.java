package org.example.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleCheckerTest {

    @Test
    public void testEquilateral() {
        assertEquals("Equilateral triangle", TriangleChecker.checkTriangle(5, 5, 5));
    }

    @Test
    public void testIsosceles() {
        assertEquals("Isosceles triangle", TriangleChecker.checkTriangle(5, 5, 3));
    }

    @Test
    public void testScalene() {
        assertEquals("Scalene triangle", TriangleChecker.checkTriangle(3, 4, 5));
    }

    @Test
    public void testNotTriangle() {
        assertEquals("Not a triangle", TriangleChecker.checkTriangle(1, 2, 3));
    }

    @Test
    public void testZeroSides() {
        assertEquals("Not a triangle", TriangleChecker.checkTriangle(0, 0, 0));
    }
}
