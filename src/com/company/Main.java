package com.company;

public class Main {

    public static void main(String[] args) {

        String string = "Homework";
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char vowel = string.charAt(i);
            if ((vowel == 'a') ||
                    (vowel == 'o') ||
                    (vowel == 'e') ||
                    (vowel == 'i') ||
                    (vowel == 'u')) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}

