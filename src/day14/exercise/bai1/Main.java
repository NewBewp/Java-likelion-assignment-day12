package day14.exercise.bai1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        String a = "Madam";
        String b = "radar";
        String c = "defied";
        isPalindrome(a);
        isPalindrome(b);
        isPalindrome(c);

        checkPalindrome(a);
        checkPalindrome(b);
        checkPalindrome(c);
    }

    public static void isPalindrome(String s) {
        boolean palindrome = true;
        String reverse = new StringBuilder(s).reverse().toString().toLowerCase();

        if (reverse.equals(s.toLowerCase())) {
            System.out.println(s +":" +reverse +" is Palindrome : "  + palindrome);
        }else {
            palindrome = false;
            System.out.println(s +":"+ reverse +" is not Palindrome : "  + palindrome);
        }
    }

    public static void checkPalindrome(String s) {
        Predicate<String> palindromeChecker = str -> {
           String reverse = new StringBuilder(str).reverse().toString();
           return reverse.equals(s.toLowerCase());
        };
        boolean isPalindrome = palindromeChecker.test(s);
        System.out.println(s + " is Palindrome: " + isPalindrome);
    }
}
