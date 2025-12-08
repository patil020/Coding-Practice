public class SearchElement {
      public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i; // return index
        }
        return -1; // not found
    }
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int target = 80;
        int result = searchElement(array, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    
}
