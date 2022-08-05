package com.fun.misc;

public class FizzBuzz {
    public static void main (String[] args) {
        fizzBuzz();
    }

    /**
     * Prints "Fizz" - if a number between 0 and 100 is divisible by 3
     * Prints "Buzz" - if a number between 0 and 100 is divisible by 5
     * Prints "FizzBuzz" - if a number between 0 and 100 is divisible by 15
     * Prints number if the above are not true
     */
    protected static void fizzBuzz() {
        for (int i=0; i<100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
