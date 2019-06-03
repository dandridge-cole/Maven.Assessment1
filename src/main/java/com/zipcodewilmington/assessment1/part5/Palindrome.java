package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){
    int length = input.length();
    Integer answer = length;
    for (int i = 1; i <= length; i++){
        for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
            if (input.charAt(j) == input.charAt(k)) {
                answer++;
            } else break;
        }

    }
        return answer;
    }
}
