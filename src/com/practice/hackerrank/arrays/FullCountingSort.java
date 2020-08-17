package com.practice.hackerrank.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FullCountingSort {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List l1 = Arrays.asList(0, "ab");
        List l2 = Arrays.asList(6, "cd");
        List l3 = Arrays.asList(0, "ef");
        List l4 = Arrays.asList(6, "gh");
        List l5 = Arrays.asList(4, "ij");
        List l6 = Arrays.asList(0, "ab");
        List l7 = Arrays.asList(6, "cd");
        List l8 = Arrays.asList(0, "ef");
        List l9 = Arrays.asList(6, "gh");
        List l10 = Arrays.asList(0, "ij");
        List l11 = Arrays.asList(4, "that");
        List l12 = Arrays.asList(3, "be");
        List l13 = Arrays.asList(0, "to");
        List l14 = Arrays.asList(1, "be");
        List l15 = Arrays.asList(5, "question");
        List l16 = Arrays.asList(1, "or");
        List l17 = Arrays.asList(2, "not");
        List l18 = Arrays.asList(4, "is");
        List l19 = Arrays.asList(2, "to");
        List l20 = Arrays.asList(4, "the");
        List list1 = Arrays.asList(l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20);
        countSort(list1);

    }

    static void countSort(List<List<String>> arr) {
        List<List<String>> result = new ArrayList<>();
        int maxval = 0;
        for (int i = 0; i < arr.size(); i++) {
            //if(arr.get(i).get(0))
        }
        System.out.println(maxval);
    }
}
