package classes;

import java.math.BigInteger;

public class ArraySolutionClass {

    static public int solution(int[] a) throws Exception {

        if (a == null) {
            throw new Exception("Array is not initialized.");
        } else if (a.length == 0) {
            throw new Exception("Array is empty.");
        }

        BigInteger numberFromArray = BigInteger.valueOf(0);
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0) {
                throw new Exception("Array contains negative values.");
            }
            else if (a[i] > 9) {
                throw new Exception("Array contains value bigger than 9.");
            }
            numberFromArray = numberFromArray.add(BigInteger.valueOf((long)(a[i] * Math.pow(10, i))));
        }

        BigInteger newNumber = numberFromArray.multiply(BigInteger.valueOf(17));
        String newNumberAsString = newNumber.toString();

        BigInteger result = BigInteger.valueOf(0);
        for (int i = 0; i < newNumberAsString.length(); i++) {
            result = result.add(BigInteger.valueOf(newNumberAsString.charAt(i) - '0'));
        }
        return result.intValue();
    }



}
