import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {1,5,4,3,2};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {5};
        int[] arr = {-1,7,3,-4,5};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean swap;  //If it is already sorted for then
        //run the steps n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            swap = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
            //if you did not swap for a particular value of i , it means the array is sorted hence stop the program.
            if (swap == false){
                break;
            }
        }
    }
}
