package COM.DSA_Array;
import java.util.*;
public class MaxInArray {
    public static void main(String[] args) {
        int [] arr = {1,3,23,43,4,0};
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum Element in the array is : "+max(arr));

    }
    static int max(int [] arr){
        int maxVal = arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
