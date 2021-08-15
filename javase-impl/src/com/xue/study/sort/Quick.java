package com.xue.study.sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 6, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i, j, lv, tmp;

        if (left >= right) {
            return;
        }

        lv = arr[left];
        i = left;
        j = right;

        while (i < j) {
            while (arr[j] >= lv && i < j) {
                j--;
            }

            while (arr[i] <= lv & i < j) {
                i++;
            }

            tmp = arr[i];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        arr[left] = arr[i];
        arr[i] = lv;

        quickSort(arr, left, i - 1);
        quickSort(arr, j + 1, right);
    }
}
