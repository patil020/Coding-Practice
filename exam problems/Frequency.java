import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Frequency {
    Map<Character, Integer> map = new HashMap<>();

    public Frequency() {
        String s = "abbccde";
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
    }
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complements=target-nums[i];
            if(map.containsKey(complements)){
return new int[]{map.get(complements),i}; 
           }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Frequency freq = new Frequency();
        System.out.println(freq.map); // {a=1, b=2, c=2, d=1, e=1}
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println("Two Sum Indices: " + Arrays.toString(ans));
    }
}
