

public class BubbleSort {

	private int array[];
	private int length;

	public void sort(int[] inputArr) {
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		bubbleSort(length);
	}
	
	private void bubbleSort(int length) {
		boolean swapped = true;
		while (swapped){
			swapped= false;
			for (int counter =0; counter<length-1; counter++){
				if (array[counter]>array[counter+1]){
					exchangeNumbers(counter,counter+1);				
					swapped = true;
				}
			}
		}
			
		
	}

	private void exchangeNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String a[]){

		BubbleSort sorter = new BubbleSort();
		int[] input = {24,2,45,20,56,23};
		sorter.sort(input);
		for(int x:input){
			System.out.print(x);
			System.out.print(" ");
		}
	}
}
