public class CheckSortedArray {

    public static boolean checkArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { 
            if (arr[i] > arr[i + 1]) {   
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 24, 53, 99}; 
        int[] arr2 = {1, 5, 4, 2, 5, 24, 53, 99};

        System.out.println("Array 1 sorted - " + checkArray(arr));
        System.out.println("Array 2 sorted - " + checkArray(arr2));
    }
}
