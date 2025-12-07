import java.util.*;
// find the minimum unhappy student who did not got trip coding questions they give three parameter 
//as input then input1 as the total student ,input2 as the array of the student for example[1,1,2,2,2,3,4,4]
//and input3 as the required student for trip for example 3 then we have unhappy studen who did not get chance
//but friend get from the his group means student get unhappy when thiere friend get chance ffrom the group


public class MinUnhappyTrip {
    public static int minUnhappy(int n, int[] groups, int k) {
        if (k <= 0) return 0;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int g : groups) freq.put(g, freq.getOrDefault(g, 0) + 1);
        List<Integer> sizes = new ArrayList<>(freq.values());
        Collections.sort(sizes);

        int remaining = k;
        for (int s : sizes) {
            if (remaining >= s) {
                remaining -= s;
            } else {
                
                return s - remaining; 
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] groups = {1,1,2,2,2,3,4,4};
        int k = 4;
        System.out.println(minUnhappy(n, groups, k)); 
    }
}
