import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class CommonElement {
   public static void CommonElement(int[] a, int[] b) {
        System.out.println("Common elements in both arrays:");
        Set<Integer> set = new LinkedHashSet<>();
        List<Integer> commonElements = new ArrayList<>();
        for (int x : a) {
            set.add(x);
            for (int y : b) {
                if (set.contains(y)) {
                    commonElements.add(y);
                    set.remove(y); 
                }
            }

        }
        for (int y : commonElements) {
            System.out.println(y);    
        }
      
    }
    public static void main(String[] args) {
       // CommonElement ce = new CommonElement();
        int[] array1 = {1, 2, 3, 4, 5, 5};
        int[] array2 = {4, 5, 6, 7, 8, 5};
        //ce.CommonElement(array1, array2);
        CommonElement.CommonElement(array1, array2);
    }
}
