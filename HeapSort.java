import java.util.Arrays;

public class HeapSort {
    public static void heapSort(int[] array) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move the current root to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < n && array[left] > array[largest])
            largest = left;

        // If right child is larger than largest so far
        if (right < n && array[right] > array[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
    
    public static void main(String[] args){
        int[] arr = {3, 69, 45, 88, 24, 1, 5};

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));

        heapSort(arr);

        System.out.println("Sorted array: ");
        System.out.print(Arrays.toString(arr));
    }//end main

}
