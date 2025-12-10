public class FindFirstAndSecondBiggestElement {
    public static int[] findFirstAndSecondBiggest(int[] arr) {
        if (arr == null || arr.length < 2) {
            System.out.println("Array must contain at least two elements.");
            return null;
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1) {
                max2 = x;
            }
        }
        return new int[]{max1, max2};
    }
    public static void main(String[] args) {
        int[] array = { 12, 35, 1, 10, 34, 1 };
        int[] result = findFirstAndSecondBiggest(array);
        if (result != null) {
            System.out.println("First Biggest: " + result[0]);
            System.out.println("Second Biggest: " + result[1]);
        }

    }
}
