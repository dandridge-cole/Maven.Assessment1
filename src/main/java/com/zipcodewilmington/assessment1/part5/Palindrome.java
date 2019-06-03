package com.zipcodewilmington.assessment1.part5;
import static com.zipcodewilmington.assessment1.part1.IntegerUtils.getSumOfN;
import static com.zipcodewilmington.assessment1.part1.BasicStringUtils.reverse;

public class Palindrome {

    public Integer countPalindromes(String input){
        Integer counter=0;
        Integer pointer=0;
        Integer numSubs=getSumOfN(input.length());
        String[] allSubs = new String[numSubs];
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 0; j <= input.length()-i; j++) {
                allSubs[pointer++]=input.substring(j,j+i);
            }
        }
        for (int i = 0; i < numSubs; i++) { if(allSubs[i].equals(reverse(allSubs[i])))counter++; }
        return counter;
    }


}
