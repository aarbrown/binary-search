package com.abrown.app;

public class IterativeBinarySearch implements IBinarySearch{
    public int search(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (sortedArray[mid] == key) {
                return mid;
            } else if (key < sortedArray[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // key does not exist in array
        return -1;
    }
}
