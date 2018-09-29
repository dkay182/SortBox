/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortstuff;

/**
 *
 * @author danielbkay
 */
public class MergeSort {
    void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    void merge(int[] arr, int start, int mid, int end) {
        int fhl = mid - start + 1;
        int lhl = end - mid;
        int[] fh = new int[fhl];
        int[] lh = new int[lhl];

        for (int i=0; i<fh.length; i++) {
            fh[i] = arr[start + i];
        }
        for (int i=0; i<lh.length; i++) {
            lh[i] = arr[mid + i + 1];
        }

        int i = 0, j = 0;
        int k = start;

        while (i < fhl && j < lhl) {
            if (fh[i] < lh[j]) {
                arr[k] = fh[i];
                i++;
                k++;
            }
            else {
                arr[k] = lh[j];
                j++;
                k++;
            }
        }
        while (i < fhl) {
            arr[k] = fh[i];
            i++;
            k++;
        }
        while (j < lhl) {
            arr[k] = lh[j];
            j++;
            k++;
        }
    }
}
