package com.tna;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        countingSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    // Counting sort method
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Find the maximum and minimum elements
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
                
        int range = max - min + 1;

        // Create count array with the size of the range
        int[] count = new int[range];
        Arrays.fill(count, 0);

        // Store the count of each element in the count array
        for (int num : arr) {
            count[num - min]++;
        }

        // Modify the count array by adding the previous counts (cumulative sum)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // Build the output array
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements into original array
        System.arraycopy(output, 0, arr, 0, n);
    }
}
