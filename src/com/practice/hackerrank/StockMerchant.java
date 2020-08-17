package com.practice.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class StockMerchant {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(stockMerchant(9, arr));
    }

    public static long stockMerchant(int n, int[] arr) {
        int pairs = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                pairs++;
                set.remove(arr[i]);
            }
        }
        return pairs;
    }
}
