import java.util.Arrays;

public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 8, 9};
        int[] arr2 = {3, 4, 8, 9};
        int[] mergedArray = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        // merge logic
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // remaining elements
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        //  print merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        for (int x : mergedArray) {
            System.out.println(x);         
        }
    }
}
