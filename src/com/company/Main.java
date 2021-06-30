package com.company;

public class Main {

    public static void main(String[] args) {
//          Linda homework:

//        String string = "Homework";
//        int count = 0;
//        for (int i = 0; i < string.length(); i++) {
//            char vowel = string.charAt(i);
//            if ((vowel == 'a') ||
//                    (vowel == 'o') ||
//                    (vowel == 'e') ||
//                    (vowel == 'i') ||
//                    (vowel == 'u')) {
//                count++;
//            }
//        }
//        System.out.println("Number of vowels: " + count);


//        Other solutions:

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        String apple = "apple";

//      1. change apple to chat array
        char[] appleArray = apple.toCharArray();
        int vowelCounter = 0;
//        for (int i = 0; i < appleArray.length; i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (appleArray[i] == vowels[j]) {
//                    vowelCounter++;
//                    break;
//                }
//            }
//        }

//      in arrays, .length is a field but in strings .length() is a method

//        2. If
//        for (int i = 0; i < apple.length(); i++) {
//            for (int j = 0; j < vowels.length; j++) {
//                if (apple.charAt(i) == vowels[j]) {
//                    vowelCounter++;
//                    break;
//                }
//            }
//        }


//        3.Switch

        for (int i = 0; i < apple.length(); i++) {
            switch (apple.charAt(i)) {
                case 'a':
                case 'e':
                case 'o':
                case 'i':
                case 'u':
                    vowelCounter ++;
                    break;
            }
        }
        System.out.println("The number of vowels in " + apple + " is " + vowelCounter);
    }
}

