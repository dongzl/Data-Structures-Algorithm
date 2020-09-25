package com.leetcode.solution.sort;

import java.util.Arrays;

/**
 * @author dongzonglei
 * @description
 * @date 2019-09-03 16:54
 */
public class MergeSortTest {

    private static int i = 1;

    /**
     * 归并排序
     *
     * @param array
     * @return
     */
    public static int[] mergeSort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

    public static void main(String args[]) throws Exception {
        int[] array = new int[]{3, 8, 9, 20, 4, 8, 6};
        int[] result = mergeSort(array);
        System.out.println(result);
    }
}
