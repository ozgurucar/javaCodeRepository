package org.ozgurucar;

public class Palindrome {
    public static void main(String[] args) {
    String text = "asksaakw";
        System.out.println(palindrome(text));

    }

    public static boolean palindrome(String text) {

           int len = text.length();
           if(len == 0) {
               System.out.println("0dan büyük gir");
               return false;
           }
           if (len == 1)
               return true;

           if(text.charAt(0) == text.charAt(len -1)) {
               if(len <= 2)
                   return true;
               else {
                   return palindrome(text.substring(1, len - 1));
               }
           }
           else {
               return false;
           }
    }

}
