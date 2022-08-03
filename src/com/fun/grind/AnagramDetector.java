package com.fun.grind;

public class AnagramDetector {

    public static void main(String[] args) {
        var s = "fairway";
        var t = "wayfair";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        //There are 26 letters in the English alphabet.
        int[] countOfCharacters = new int[26];

        //First check - if the lengths for both strings DO NOT match, return false!
        if (s.length() != t.length()) return false;

        for (var i=0; i< s.length(); i++) {

            //Increment from the first string, decrement from the second
            //Example: countOfCharacters['a' - 'a'] = countOfCharacters[0], which is 1
            countOfCharacters[s.charAt(i)-'a']++;
            countOfCharacters[t.charAt(i)-'a']--;
        }

        for (var characterCount: countOfCharacters) {
            //If the character count is not 0, there are more characters to validate.
            if (characterCount !=0) {
                return false;
            }
        }

        return true;
    }
}
