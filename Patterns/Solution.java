public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); // print stars on same line
            }
            System.out.println(); // move to next line
        }
    }
}
