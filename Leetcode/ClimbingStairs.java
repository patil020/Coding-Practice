package Leetcode;

public class ClimbingStairs {
  
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int first = 1;   
        int second = 2;  
        
        for (int i = 3; i <= n; i++) {
            int third = first + second;  
            first = second;
            second = third;
        }
        return second;
    }
    
  
    
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        
        // Test Case 1: n = 2
        int n1 = 2;
        int result1 = cs.climbStairs(n1);
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + result1);
        System.out.println("Explanation: 1 step + 1 step, or 2 steps\n");
        
        // Test Case 2: n = 3
        int n2 = 3;
        int result2 = cs.climbStairs(n2);
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + result2);
        System.out.println("Explanation: 1+1+1, or 1+2, or 2+1\n");
        
        // Test Case 3: n = 5
        int n3 = 5;
        int result3 = cs.climbStairs(n3);
        System.out.println("Input: n = " + n3);
        System.out.println("Output: " + result3);
        System.out.println("Explanation: 8 distinct ways\n");
        
        // Test Case 4: n = 1
        int n4 = 1;
        int result4 = cs.climbStairs(n4);
        System.out.println("Input: n = " + n4);
        System.out.println("Output: " + result4);
       
    }
}
