package com.fun.grind;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        var list = fizzBuzz(3);

        list.forEach(str -> System.out.println(str));
    }

    protected static List<String> fizzBuzz(int n) {
        var outputList = new ArrayList<String>();

        for (int i=1, fizz=0, buzz=0; i<=n; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                fizz = 0;
                buzz = 0;
                outputList.add("FizzBuzz");
            }
            else if (fizz == 3) {
                fizz = 0;
                outputList.add("Fizz");
            }
            else if (buzz == 5) {
                buzz = 0;
                outputList.add("Buzz");
            }
            else {
                outputList.add(Integer.toString(i));
            }
        }
        return outputList;
    }
}
