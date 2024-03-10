import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {5,3,4,1,2};
//        int[] arr = {1,5,4,3,2};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {5};
        int[] arr = {-1,7,3,-4,5};
        for (int i = 0; i <= arr.length-2 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    //When arr[j] is not smaller than arr[j-1] ,then break. Because every element on the left hand side is sorted.
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
