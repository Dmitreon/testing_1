package org.example.testing;

public class TriangleChecker {
    public static String checkTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c || a + c <= b || b + c <= a)) {
            return "Not a triangle";
        }

        if (a == b && b == c) {
            return "Equilateral triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }
}
