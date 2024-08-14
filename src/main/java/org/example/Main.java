package org.example;


import java.util.LinkedList;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {

    public static void main(String[] args) {
        String sonuc = convertDecimalToBinary(28);
        System.out.println(sonuc);
        System.out.println(convertDecimalToBinary(21));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
        System.out.println(checkForPalindrome("I did, did I?")+ "true");
        //
        System.out.println(checkForPalindrome("Racecar") + "true");
        System.out.println(checkForPalindrome("hello") + "false");
        //
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?")+ "true");
        System.out.println(checkForPalindrome("Test") + "false");
        System.out.println(checkForPalindrome("Welcome") + "false");
    }
    public static boolean checkForPalindrome(String string) {
        String text = string.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        LinkedList<Character> charList = new LinkedList<>();

        for (char c : text.toCharArray()) {
            charList.add(c);
        }

        while (charList.size() > 1) {
            if (!charList.pollFirst().equals(charList.pollLast())) {
                return false;
            }
        }
        return true;

        // Stack yapisi kullanarak yapabilirdim.
    }
    public static String convertDecimalToBinary(int num){
        LinkedList<Integer> numList = new LinkedList<>();
        while (num>0){
            int reminder = num % 2 ;
            numList.addFirst(reminder);
            num = num / 2; //devam etsin diye
        }
        StringBuilder numStr = new StringBuilder();
        for (int digit : numList){
            numStr.append(digit);
        }
        return numStr.toString();
    }


}