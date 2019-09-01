package com.leetcode.solution.sort;

/**
 * @author dongzonglei
 * @description
 * @date 2019-09-01 20:12
 */
public class SelectionSortTest {

    public void selectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for(int i = 0; i < n - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // 交换
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }

    public static void main(String args[]) throws Exception {
        SelectionSortTest test = new SelectionSortTest();
        int[] a = new int[]{4, 5, 6, 3, 2, 1};
        test.selectionSort(a, a.length);
        System.out.println(a);
    }
}
