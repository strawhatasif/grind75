package com.fun.grind;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        var string = "()";
        System.out.println(isValid(string));
    }

    public static boolean isValid(String inputString) {

        //The string length has to be even
        if (inputString.length() % 2 != 0) return false;

        var characterStack = new Stack<Character>();

        for (char character: inputString.toCharArray()) {

            //Push the opening bracket on to the Stack
            if (character == '(' || character == '{' || character == '[') {
                characterStack.push(character);
            }
            //Given a Character Stack that is not empty, verify that the corresponding opening bracket is present
            //If it is, pop off from the character stack.
            else if (character == ')' && !characterStack.isEmpty() && characterStack.peek() == '(') {
                characterStack.pop();
            }
            else if (character == '}' && !characterStack.isEmpty() && characterStack.peek() == '{') {
                characterStack.pop();
            }
            else if (character == ']' && !characterStack.isEmpty() && characterStack.peek() == '[') {
                characterStack.pop();
            }
            else {
                return false;
            }
        }
        //If valid, this will return true.
        return characterStack.isEmpty();
    }
}
