package insertionSorting;

class InsertionSort {

	//It will take O{n2} time to run.
	
	private static int key;

	public static void sort(int arr[]) {

		for (int j = 1; j < arr.length; j++) {

			key = arr[j];
			int i = j - 1;

			while (i >= 0 && key < arr[i]) {
				arr[i+1] = arr[i];
				i = i-1;
			}
			arr[i+1] = key;

		}

	}
}
