package org.sunny.base.algorithm.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/5
 * @Version V1.0
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {56, 9, 10, 19, 28, 37, 34, 52, 2, 45};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

    private static void sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            boolean hasSort = true;
            for (int i = 1; i < arr.length - j; i++) {
                if (arr[i] < arr[i - 1]) {
                    swap(arr, i, i - 1);
                    hasSort = false;
                }
            }
            if (hasSort) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int x, int y) {
        if (arr[x] == arr[y]) {
            return;
        }
        arr[x] = arr[x] ^ arr[y];
        arr[y] = arr[x] ^ arr[y];
        arr[x] = arr[x] ^ arr[y];
    }

}
