package org.example;

public class SumCalculator {
    public int add (int n){
        if(n==0){
            throw new IllegalArgumentException("n can not be zero");
        }
        int sum = 0;
        for (int i=1; i<=n;i++){
            sum+=i;
        }
        return sum;
    }
}
