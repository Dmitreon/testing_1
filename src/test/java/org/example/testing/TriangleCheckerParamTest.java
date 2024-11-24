package org.example.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleCheckerParamTest {

    @ParameterizedTest
    @CsvSource({
            "3, 4, 5, Scalene triangle",
            "5, 5, 5, Equilateral triangle",
            "5, 5, 3, Isosceles triangle",
            "1, 2, 3, Not a triangle",
            "0, 0, 0, Not a triangle"
    })
    void testCheckTriangle(int a, int b, int c, String expected) {
        assertEquals(expected, TriangleChecker.checkTriangle(a, b, c));
    }
}
