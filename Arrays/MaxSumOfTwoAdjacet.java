public class MaxSumOfTwoAdjacet {
    public static int maxSumOfTwoAdjacent(int[] a) {
        if (a == null || a.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int maxSum = a[0] + a[1];

        for (int i = 1; i < a.length - 1 ; i++) {
            int currentSum = a[i] + a[i + 1];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 8, 0, -1, 4};
        int result = maxSumOfTwoAdjacent(array);
        System.out.println("Maximum sum of two adjacent elements: " + result);
    }
}
