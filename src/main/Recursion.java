package main;

import java.math.BigInteger;

public class Recursion {
    static BigInteger factorial(BigInteger number){
        if (number.equals(BigInteger.ONE) ){
            return  BigInteger. ONE;
        }
        return  number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }


    public static void main(String[] args) {
     Recursion recursion= new Recursion();

        System.out.println(factorial(BigInteger.valueOf(15)));
    }
}
