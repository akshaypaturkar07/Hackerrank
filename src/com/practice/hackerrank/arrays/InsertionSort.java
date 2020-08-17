package com.practice.hackerrank.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 1, 2};
        System.out.println(insertionSort(nums));
        System.out.println("====================");
        for (int n : nums) {
            System.out.println(n);
        }
    }

    static int insertionSort(int[] nums) {
        int n = nums.length;
        int counter = 0;
        for (int i = 1; i < n; ++i) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
                counter++;
            }
            nums[j + 1] = key;

        }
        return counter;
    }
}
