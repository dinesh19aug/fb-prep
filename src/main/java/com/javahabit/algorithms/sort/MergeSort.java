package com.javahabit.algorithms.sort;

public class MergeSort {
    //// {90,23,101,45,65,23,67,89,34,23}
    // Merge
    void merge(int arr[], int beg, int mid, int end) {
        int left = mid - beg +1;
        int right = end - mid;

        int[] leftArray = new int[left];
        int[] rightArray = new int[right];

        // copy values to left Array
        for (int i = 0; i < left; i++) {
            leftArray[i] = arr[beg + i];
        }
        // copy values to right array
        for (int i = 0; i < right; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = beg;
        // Compare the left and right array value and save in temp array arr
        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        // copy any items left in left array
        while (i < left) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        // copy any items left in right array
        while (j < right) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

    }

    // {90,23,101,45,65,23,67,89,34,23}
    void sort(int arr[], int beg, int end) {
        if (beg < end) {
            //int mid =beg + (end -beg) / 2;
            int mid = (beg+end)/2;
            sort(arr, beg, mid);
            sort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }
    

    public static void main(String args[]) {
        int arr[] = { 90, 23, 101, 45, 65, 23, 67, 89, 34, 23 };
        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }

    }
}
