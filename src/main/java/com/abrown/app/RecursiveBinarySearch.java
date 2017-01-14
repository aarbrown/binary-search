package com.abrown.app;

public class RecursiveBinarySearch implements IBinarySearch{
    public int search(int[] sortedArray, int key) {
        return search_recursive(sortedArray, key, 0, sortedArray.length - 1);
    }

    private int search_recursive(int[] sortedArray, int key, int low, int high) {
        // key does not exist
        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);
        if (sortedArray[mid] == key) {
            return mid;
        } else if (key < sortedArray[mid]) {
            return search_recursive(sortedArray, key, low, mid - 1);
        } else {
            return search_recursive(sortedArray, key, mid + 1, high);
        }
    }
}
