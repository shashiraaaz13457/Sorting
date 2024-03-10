import java.util.Arrays;

public class SelectionSort {
        public static void main(String[] args) {
//        int[] arr = {1,5,4,3,2};
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {5};
//        int[] arr = {-1,7,3,-4,5};
          int[] arr = {4,5,1,2,3};
            Selection(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void Selection(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                //find the maxm element in remaining array and swap with the correct index.
                int last = arr.length-i-1;
                int maxIndex = FindMax(arr,last);

                swap(arr,maxIndex,last);

            }
        }
        static void swap(int[] arr,int first, int last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
        }
        static int FindMax(int[] arr,int last){
            //Finding the max index
            int max = 0;
            for (int i = 1; i <= last; i++) {
                if (arr[i] > arr[max]){
                    max = i;
                }
            }
            return max;
        }
}
