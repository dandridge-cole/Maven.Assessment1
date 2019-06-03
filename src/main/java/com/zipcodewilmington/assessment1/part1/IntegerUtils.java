package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        return (n*(n+1))/2;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        Integer answer=1;
        for (int i = 2; i <=n; i++) {
            answer*=i;
        }
        return answer;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        StringBuilder builder=new StringBuilder();
        String valAsString = val.toString();
        for (int i = valAsString.length()-1; i >=0 ; i--) {
            builder.append(valAsString.charAt(i));
        }
        return Integer.parseInt(builder.toString());
    }
}
