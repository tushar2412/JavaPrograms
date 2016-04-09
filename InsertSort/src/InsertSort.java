import java.util.Arrays;

public class InsertSort {

	public static void insertionSort(int[] A) {
		for (int i = 1; i < A.length; i++) {
			int j;
			int temp = A[i];
			for (j = i-1; j >= 0 && temp < A[j]; j--)
				A[j + 1] = A[j];
			A[j + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int[] data = { 5, 3, 0, 2, 4, 1, 0, 5, 2, 3, 1, 4 };
		
		System.out.println("Before: " + Arrays.toString(data));
		insertionSort(data);
		System.out.println("After:  " + Arrays.toString(data));
	}

}
