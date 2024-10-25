import java.util.Arrays;
public class CountingSort {
    
    public static void countingSort(int[] array, int max) {
        int[] countArray = new int[max + 1];
        int[] sortedArray = new int[array.length];

        for (int num : array) {
            countArray[num]++;
        }

        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--) {
            sortedArray[countArray[array[i]] - 1] = array[i];
            countArray[array[i]]--;
        }

        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int[] arr = {3, 69, 45, 88, 24, 1, 5};
        int max = 88;

        System.out.println("Original array: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();

        countingSort(arr, max);

        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }
}
