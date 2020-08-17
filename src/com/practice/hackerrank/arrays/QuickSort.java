package com.practice.hackerrank.arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 7, 2};
        quickSort(arr);
        for (int n : quickSort(arr)) {
            System.out.println(n);
        }
    }

    static int[] quickSort(int[] arr) {
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int center[] = {arr[0]};
        int lefCounter = 0;
        int rightCounter = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < center[0]) {
                left[lefCounter] = arr[i];
                lefCounter++;
            } else if (arr[i] > center[0]) {
                right[rightCounter] = arr[i];
                rightCounter++;
            }
        }
        for (int j = 0; j < lefCounter; j++) {
            arr[j] = left[j];
        }
        arr[lefCounter] = center[0];
        for (int k = 0; k < rightCounter; k++) {
            arr[lefCounter + 1] = right[k];
            lefCounter++;
        }
        return arr;
    }
}
