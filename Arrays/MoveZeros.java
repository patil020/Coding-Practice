public class MoveZeros {
    public static void main(String... args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5};
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
        System.out.print("Array after moving zeros: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
