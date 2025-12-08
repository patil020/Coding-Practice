public class InsertAtPosition {
    void insertAtPosition(int[] arr, int value, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Invalid position");
        }
        int n = arr.length;
        int[] res = new int[n + 1];
        
        // Copy elements before insertion point
        for (int i = 0; i < pos - 1; i++) {
            res[i] = arr[i];
        }
        
        // Insert the value
        res[pos - 1] = value;
        
        // Copy elements after insertion point
        for (int i = pos; i < n + 1; i++) {
            res[i] = arr[i - 1];
        }
        
        System.out.println("Array after insertion:");
        for (int num : res) {
            System.out.print(num + " ");
        }
    }
            public static void main(String[] args) {
        InsertAtPosition obj = new InsertAtPosition();
        int[] array = { 10, 20, 30, 40, 50 };
        int valueToInsert = 25;
        int positionToInsert = 2;
        obj.insertAtPosition(array, valueToInsert, positionToInsert);   
            }
    }
