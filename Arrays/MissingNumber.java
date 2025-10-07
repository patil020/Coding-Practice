public class MissingNumber {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 3, 4, 5, 7};

        int n = arrs.length + 1;             
        int expectedSum = n * (n + 1) / 2;   
        int actualSum = 0;

        for (int x : arrs) {
            actualSum += x;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number from the array: " + missingNumber);
    }
}
