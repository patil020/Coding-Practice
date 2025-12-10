package Leetcode.java;

public class CountSquareSumTriplet {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(i*i + j*j == k*k){
                    count++;
                    }
                }
            }
        }
        return count;

    }
    //it is right way but it is not optimised

    /*class Solution {
    public int countTriples(int n) {
        int count = 0;

        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                int c2 = a * a + b * b;   // c²
                int c = (int) Math.sqrt(c2);

                if (c <= n && c * c == c2) {
                    count++;
                }
            }
        }
        return count;
    }
}

     */
}

