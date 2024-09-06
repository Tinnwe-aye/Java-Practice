package com.tna;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(arr));

        radixSort(arr);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }

    // Method to implement Radix Sort
    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = Arrays.stream(arr).max().getAsInt();

        // Apply counting sort to sort elements based on the place value
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // A method to do counting sort of arr[] according to the digit represented by exp
    public static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // Output array
        int[] count = new int[10]; // There are 10 possible digits (0 to 9)

        // Initialize count array with 0
        Arrays.fill(count, 0);

        // Store the count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            int index = (arr[i] / exp) % 10;
            count[index]++;
        }

        // Change count[i] so that it contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int index = (arr[i] / exp) % 10;
            output[count[index] - 1] = arr[i];
            count[index]--;
        }

        // Copy the output array to arr[], so that arr[] contains sorted numbers according to current digit
        System.arraycopy(output, 0, arr, 0, n);
    }
}

