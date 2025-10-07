public class MaxTempInWindow {
    public static void main(String[] args) {
        int[] temp = { 29, 33, 20, 31, 29, 28, 27, 45 };
        int n = temp.length;
        System.out.println(n);
        int k = 3;
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = temp[i];
            for (int j = i; j <= i + k - 1; j++) {
                if (temp[j] > max) {
                    max = temp[j];
                }

            }
            result[i] = max;
        }
        System.out.println("Max temperatures for each 3-day window: ");
        for (int x : result) {
            System.out.println(x);
        }

    }
}
