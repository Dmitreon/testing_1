package org.example.testing;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter three sides of a triangle (non-negative integers):");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            String result = TriangleChecker.checkTriangle(a, b, c);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter three positive integers.");
        }
    }
}
