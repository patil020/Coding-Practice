package Leetcode.java;

public class Mysqrt{

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;      // Update answer
                left = mid + 1; // Try for a bigger number
            } else {
                right = mid - 1; // Try for a smaller number
            }
        }
       
        return ans;
    }  
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("The integer square root of " + x + " is: " + result)    ;
    } 
}