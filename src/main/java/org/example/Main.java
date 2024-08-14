package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String sonuc = convertDecimalToBinary(28);
        System.out.println(sonuc);
        System.out.println(convertDecimalToBinary(21));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
    }
    public static boolean checkForPalindrome(String string) {
        String text = string.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
        StringBuilder strStringBuilder = new StringBuilder(text).reverse();
        return text.equals(strStringBuilder.toString());
    //Stack yapisi kullanarak yapabilirdim.
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