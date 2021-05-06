/*
* This program gets some integer input,
* calculates the intger using recursion and shows the factorial integer.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-05-06
*/
// package ca.mths.unit3.unit02.java.main;

import java.util.Scanner;

public final class FactorialCalculator {
    private FactorialCalculator() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method uses recursion to be factorial some integer.
    * @param someInteger - positive integer
    * @return factorialInteger
    */
    public static int factorial(final int someInteger) {
        if (someInteger == 1 || someInteger == 0) {
            return 1;
        } else {
            return someInteger * factorial(someInteger - 1);
        }
    }

    /**
    * This method This program gets some integer input
    * and shows the factorial integer.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Input
        System.out.print("Enter the number to be factorial(!) "
                         + "(only positive integer): ");

        try {
            int someInteger = Integer.parseInt(myObj.nextLine());
            if (someInteger >= 0) {
                // Output
                System.out.println(someInteger + "! = "
                                   + factorial(someInteger));
            } else {
                System.out.println("Only positive!");
            }
        } catch (Exception ex) {
            System.err.println("Invalid input.");
        }

        System.out.println("\nDone.");
    }
}
