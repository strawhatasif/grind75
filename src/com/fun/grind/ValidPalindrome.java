package com.fun.grind;

public class ValidPalindrome {

    public static void main(String[] args) {
        var string = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(string));
    }

    protected static boolean isPalindrome(String s) {

        String alphaNumericString = "";

        //Only evaluate alphanumeric strings
        for (char character: s.toCharArray()) {
            if (Character.isDigit(character) || Character.isLetter(character)) {
                alphaNumericString += character;
            }
        }

        //Convert to lowercase
        alphaNumericString = alphaNumericString.toLowerCase();

        int beginning = 0;
        int ending = alphaNumericString.length()-1;

        //Evaluate if the beginning character matches the ending character.
        while (beginning <= ending) {
            //In the event of a mismatch, return false
            if (alphaNumericString.charAt(beginning) != alphaNumericString.charAt(ending)) {
                return false;
            }

            //Moving to the right in the character array for the beginning pointer
            //Moving to the left in the character array for the ending pointer
            beginning +=1;
            ending -=1;
        }

        return true;
    }
}
