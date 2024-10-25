import java.util.Arrays;

public class QuickSort{
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   
    public static void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = arr[low];
            int i = high+1;
            for(int j = high; j > low; j--){
                if(arr[j] >= pivot){
                    i--;
                    swap(arr, i, j);
                }
            }
            swap(arr, i-1, low);
            int pivotIndex = i-1;
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 69, 45, 88, 24, 1, 5};

        System.out.println("Original array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }
}