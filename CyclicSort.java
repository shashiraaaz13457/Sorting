import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//        int[] arr = {3,5,2,1,4};
//          int[] arr = {5,3,4,1,2};
//        int[] arr = {1,5,4,3,2};
//        int[] arr = {1,2,3,4,5};
        int[] arr = {5,4,3,2,1};

        cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    //Method 1 done by me.

//    static void cyclic(int[] arr){
//        for (int i = 0; i < arr.length; ) {
//            if (i != arr[i]-1){
//                //Check whether the element is at the correct index or not.If not then swap.
////                swap(arr,arr[i]-1,i);
//                int temp = arr[i];
//                arr[i] = arr[temp-1];
//                arr[temp-1] = temp;
//            }
//            else{
//                i++;
//            }
//        }
//    }

    //Method 2 done by kunal
    static void cyclic(int[] arr){
        for (int i = 0; i < arr.length; ) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]){
                //Check whether the element is at the correct index or not.If not then swap.
                swap(arr,correctIndex,i);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
