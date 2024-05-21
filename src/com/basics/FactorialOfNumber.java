package com.basics;

import java.math.BigInteger;

public class FactorialOfNumber {

    public void extraLongFactorials(int n) {
        BigInteger res = new BigInteger(String.valueOf(1));
        for(int i=1;i<=n;i++){
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(res);

    }

}
