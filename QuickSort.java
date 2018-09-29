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
public class QuickSort {
    void quickSort(int[] arr, int s, int e) {
        if (s < e) {
            int p = partition(arr, s, e);
            quickSort(arr, s, p-1);
            quickSort(arr, p+1, e);
        }
    }
    
    int partition(int[] arr, int s, int e) {
        int temp, pivot;
        
        int mid = s+(e-s)/2;
        
        if (arr[mid] < arr[0]) {
            temp = arr[mid];
            arr[mid] = arr[0];
            arr[0] = temp;
        }
        if (arr[e] < arr[0]) {
            temp = arr[e];
            arr[e] = arr[0];
            arr[0] = temp;
        }
        if (arr[mid] < arr[e]) {
            temp = arr[mid];
            arr[mid] = arr[e];
            arr[e] = temp;
        }
        
        pivot = arr[e];
        
        int i = s;
        for (int j=i; j<e; j++) {
            if (arr[j] < pivot) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        
        if (i != e) {
            temp = arr[i];
            arr[i] = arr[e];
            arr[e] = temp;
        }
        
        return i;
    }
}
