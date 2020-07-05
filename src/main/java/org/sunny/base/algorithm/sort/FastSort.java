package org.sunny.base.algorithm.sort;

/**
 * @ClassName FastSort
 * @Description: TODO
 * @Author sunzhen
 * @Date 2020/7/5
 * @Version V1.0
 **/
public class FastSort {
    public static void main(String[] args) {
        int[] array = {6, 11, 8, 2, 9, 4, 1, 5, 7, 10, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

    }

    private static int pivot(int[] arr, int start, int end) {
        int piv = arr[start];
        while (start < end) {
            if (arr[end] > piv)
                end--;
            else {
                arr[start++] = arr[end];
            }

            if (arr[start] <piv)
                start++;
            else {
                arr[end--] = arr[start];
            }

        }
        arr[start] = piv;
        return start;
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
