import java.util.*;
public class CountEvenAndOdd {
    public static void main(String[] args){
        int[] arrs={1,2,4,5,7,89,3,43,22,46,67,3};
        int even=0,odd=0;
        Map<Integer,String> map=new HashMap<>();
        Map<Integer,String> mp1=new LinkedHashMap<>();
        for(int x: arrs){
            if(x%2==0){
                even++;
                map.put(x ," even");
                mp1.put(x ," even");

            }else{
                odd++;
                map.put(x ,"odd");
                mp1.put(x ,"odd");
            }
            }

            for(Map.Entry<Integer,String> e:map.entrySet()){
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
               for(Map.Entry<Integer,String> e:mp1.entrySet()){
                System.out.println(e.getKey() + " -> " + e.getValue());
            }
          
            System.out.println("count of even: "+ even +" count of odd no."+odd );
        }
}
