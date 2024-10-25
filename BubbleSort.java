import java.util.Arrays;
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }//end sort

    public static void main(String[] args){
        int[] arr = {3, 69, 45, 88, 24, 1, 5};

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }//end main
}