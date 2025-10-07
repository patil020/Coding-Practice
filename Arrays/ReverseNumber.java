public class ReverseNumber {
    public static void main(String... args) {
        int m = 1234;
        int rev = 0;
        System.out.println("original number: " + m);

        while (m > 0) {
            int digit = m % 10;       
            rev = rev * 10 + digit;   
            m = m / 10;               
        }

        System.out.println("Reversed number: " + rev);
    }
}
