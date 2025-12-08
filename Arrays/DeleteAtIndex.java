public class DeleteAtIndex {
    public static void deleteAtIndex(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            throw new IllegalArgumentException("Invalid index");
        }
        int n = arr.length;
        int[] result = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i == index)
                continue;
            result[j++] = arr[i];
        }

        System.out.println("Array after deletion:");
        
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50 };
        int indexToDelete = 2;
        deleteAtIndex(array, indexToDelete);   

    }
}
