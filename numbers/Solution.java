package numbers;

public class Solution {
    public static void uptoN(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    public static void upto1(int n){
        for(int i=n;i>=1;i--){
            System.out.println(i);  
        }
    }
    public static int sum1toN(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
        sum+=i;
        }return sum;
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime1(int n){
        if(n<=1){return false;}
        if(n<=3) return true;
        if(n%2==0 ) return false;
        for(int i=3;i<=n/i;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeUptoN(int n){
        for(int i=2;i<=n;i++){
            if(isPrime1(i)){
                System.out.println(i);}
        }
    }


    public static void main(String[] args){
        int n = 5;
        System.out.println("Upto N:");
        uptoN(n);
        System.out.println("Upto 1:");
        upto1(n);
        System.out.println("Sum 1 to N:");
        System.out.println(sum1toN(n));
        System.out.println("Is Prime:");
        System.out.println(isprime(n));
        System.out.println("Is Prime1:");
        System.out.println(isPrime1(n));
    }


}
