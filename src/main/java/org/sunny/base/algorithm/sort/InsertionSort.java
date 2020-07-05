package org.sunny.base.algorithm.sort;

/**
 * @ClassName InsertionSort
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/5
 * @Version V1.0
 **/
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {56, 9, 10, 19, 28, 37, 34, 52, 2, 45};
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    private static void sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int index = j;
            while (index > 0 && arr[index] < arr[index - 1]) {
                swap(arr, index, index - 1);
                index--;
            }
        }
    }

    //优化，记下当前位置值，后面的挪动覆盖，不用比较交换
    private static void sortNoSwap(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int index = j;
            int num = arr[index];
            while (index > 0 && num < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = num;
        }
    }

    //二分搜索优化
    private static void sortBinarySearch(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int index = j;
            int num = arr[index];
            while (index > 0 && num < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = num;
        }
    }

    private static int binarySearch(int[] arr, int v) {
        int begin = 0;
        int end = arr.length;
        while (begin < end) {
            int mid = (begin + end) << 1;
            if (v == arr[mid]) {
                return mid;
            } else if (arr[mid] > v) {
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
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
