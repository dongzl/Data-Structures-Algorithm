package com.leetcode.solution.sort;

/**
 * @author dongzonglei
 * @description
 * @date 2019-09-01 20:03
 */
public class InsertionSortTest {

    // 插入排序，a 表示数组，n 表示数组大小
    public void insertionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for(; j >= 0; --j) {
                if (a[j] > value) {
                    a[j + 1] = a[j]; // 数据移动x
                } else {
                    break;
                }
            }
            a[j + 1] = value;// 插入数据
        }
    }

    public static void main(String args[]) throws Exception {
        InsertionSortTest test = new InsertionSortTest();
        int[] a = new int[]{4, 5, 6, 3, 2, 1};
        test.insertionSort(a, a.length);
        System.out.println(a);
    }
}
