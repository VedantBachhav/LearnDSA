package COM.DSA_Array;

public class PairsInArray {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};

        for(int i = 0; i<arr.length; i++){
            for(int j=1; j<arr.length; j++){
                System.out.println(arr[i]+arr[j]);

            }

        }
    }
}
