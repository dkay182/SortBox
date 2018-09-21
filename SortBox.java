package sorting_stuff;

import java.util.Random;

public class SortBox {
	
	void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
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
		
		for (int i = 0; i < fh.length; i++) {
			fh[i] = arr[start + i];
		}
		for (int i =0; i < lh.length; i++) {
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
	
	static void printArray(int[] arr) {
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int data[] = new int[10];
		Random random = new Random();
		
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(100);
		}
		
		printArray(data);
		
		SortBox ob = new SortBox();
		ob.mergeSort(data, 0, data.length-1);
		
		printArray(data);
	}

}
