public int runBinarySearchIteratively(
    int[] sortedArray, int key, int low, int high) {
    int index = Integer.MAX_VALUE;
    
    while (low <= high) {
        int mid = low  + ((high - low) / 2);
        if (sortedArray[mid] < key) {
            low = mid + 1;
        } else if (sortedArray[mid] > key) {
            high = mid - 1;
        } else if (sortedArray[mid] == key) {
            index = mid;
            break;
        }
    }
    return index;
}

public int runBinarySearchRecursively(
    int[] sortedArray, int key, int low, int high) {
    int middle = low  + ((high - low) / 2);
        
    if (high < low) {
        return -1;
    }

    if (key == sortedArray[middle]) {
        return middle;
    } else if (key < sortedArray[middle]) {
        return runBinarySearchRecursively(
          sortedArray, key, low, middle - 1);
    } else {
        return runBinarySearchRecursively(
          sortedArray, key, middle + 1, high);
    }
}
    