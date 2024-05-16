package org.example.SBA1;

import java.io.*;
public class result {
    /*
     * Complete the 'getDigitsSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER largeNumber as parameter.
     */
    public static int getDigitsSum(int largeNumber) {
        String numbersSetStr = Integer.toString(largeNumber);
        int sum = 0;
        for (int i = 0; i < numbersSetStr.length(); i++) {
            sum += Character.getNumericValue(numbersSetStr.charAt(i));
        }
        return sum;
    }
}
