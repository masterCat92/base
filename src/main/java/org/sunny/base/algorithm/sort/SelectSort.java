package org.sunny.base.algorithm.sort;

/**
 * @ClassName SelectSort
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/5
 * @Version V1.0
 **/
public class SelectSort {
    public static void main(String[] args) {
        int[] array = {56, 9, 10, 19, 28, 37, 34, 52, 2, 45};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
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
