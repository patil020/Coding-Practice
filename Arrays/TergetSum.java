import java.util.*;

public class TergetSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -7, 8, 3, 5, 4, 9, 0 };
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println(arr[i] + "->" + complement);
            }

            map.put(arr[i], i);
        }

    }
}
    