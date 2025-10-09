public class SumAverage {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int sum=0;
        for(int x :arr) sum+=x;
    
    double avg=(double) sum/arr.length;
    System.out.println("sum of arrays element: "+ sum);
    System.out.println("average of the array: "+avg);
    }

}
