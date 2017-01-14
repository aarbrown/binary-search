package com.abrown.app;

public class App
{
    public static void main( String[] args )
    {
        int[] sortedInts = {
            1,
            10,
            20,
            47,
            59,
            63,
            75,
            88,
            99,
            107,
            120,
            133,
            155,
            162,
            176,
            188,
            199,
            200,
            210,
            222
        };

        IBinarySearch[] binarySearches = new IBinarySearch[2];

        RecursiveBinarySearch recBinSearch = new RecursiveBinarySearch();
        IterativeBinarySearch itBinSearch  = new IterativeBinarySearch();

        binarySearches[0] = recBinSearch;
        binarySearches[1] = itBinSearch;

        for (IBinarySearch algorithm : binarySearches) {
            long startTime = System.nanoTime();

            algorithm.search(sortedInts, 1);

            long endTime = System.nanoTime();
            long duration = (endTime - startTime);

            System.out.println(duration);
        }
    }
}
