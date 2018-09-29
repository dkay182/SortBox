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
public class InsertionSort {
    void insertionSort(int[] arr) {
        int temp, minIndex;
        
        for (int i=0; i<arr.length; i++) {
            minIndex = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            if (i != minIndex) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
