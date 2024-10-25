import java.util.Arrays;
public class InsertionSort{
    public static void insertionSort(int[] arr){
        int temp = 0;
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key <= arr[j]){
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }//end sort

    public static void main(String[] args){
        int[] arr = {3, 69, 45, 88, 24, 1, 5};

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }//end main
}