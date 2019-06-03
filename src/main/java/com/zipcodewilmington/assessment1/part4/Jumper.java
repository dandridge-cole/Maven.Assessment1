package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
    int answer = 0;
    int remainder = k % j;
    answer = k / j;
    answer += remainder;


        return answer;
    }
}
