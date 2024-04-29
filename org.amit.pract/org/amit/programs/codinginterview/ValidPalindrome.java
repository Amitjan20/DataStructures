package com.ebay.sese.rest.helper;

public class ValidPalindrome {

    public static void main(String[] args) {
        String palin = "abba";

        System.out.println(isPalindrome(palin));
    }

    private static boolean isPalindrome(String palin) {

        int i = 0;
        int j = palin.length() - 1;

        while (i < j) {

            if(palin.charAt(i)!=palin.charAt(j)){
                if(check(palin, i+1, j) || check(palin, i, j-1)){
                    return true;
                }
            }

            if (palin.charAt(i) != palin.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean check(String palin, int i, int j){
        while(i<j){
            if(palin.charAt(i)!=palin.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

