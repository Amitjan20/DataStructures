package com.ebay.domain.ocsdecisioning.common;

public class FindMinInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(findMin(arr));

    }

    public static int findMin(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return arr[start];
    }
}
