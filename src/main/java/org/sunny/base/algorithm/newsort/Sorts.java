package org.sunny.base.algorithm.newsort;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName Sorts
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/11
 * @Version V1.0
 **/
public class Sorts {
    public static void main(String args[]) {
        int[] arr = {2, 5, 1, 3, 8, 5, 7, 4, 3};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡(两两相比)
    private static void bubble(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    //选择(选择最小的，放前面)
    private static void select(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    //插入排序
    private static void insert(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                swap(arr, index, --index);
            }
        }
    }

    //归并排序
    private static void conflation(int[] arr) {
        split(arr, 0, arr.length);
    }

    private static void split(int[] arr, int left, int right) {
        if (left >= right - 1) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        split(arr, left, mid);
        split(arr, mid, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] tmp = Arrays.copyOfRange(arr, low, mid);
        int index = 0;
        int left = low;
        int right = mid;

        while (index < tmp.length && right < high) {
            if (tmp[index] < arr[right]) {
                arr[left++] = tmp[index++];
            } else {
                arr[left++] = arr[right++];
            }
        }
        while (index < tmp.length) {
            arr[left++] = tmp[index++];
        }
    }

    public static void swap(int[] arr, int x, int y) {
        if (arr[x] == arr[y])
            return;
        arr[x] = arr[x] ^ arr[y];
        arr[y] = arr[x] ^ arr[y];
        arr[x] = arr[x] ^ arr[y];
    }
}
