package myPackage;

public class ArraySorter {
	public static void main(String[] args) {
		int[] a = { 5, 6, 18, 8, 9, 7, 6, 10, 4, 1, 28 };
		System.out.println("Original array: ");
		print(a);
		bubbleSort(a);
		System.out.println("After BubbleSort: ");
		print(a);
	}

	public static void selectionSort(int[] anArray) {
		for (int index = 0; index < anArray.length - 1; index++) {
			int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
			interchange(index, indexOfNextSmallest, anArray);
		}
	}

	private static int getIndexOfSmallest(int startIndex, int[] a) {
		int min = a[startIndex];
		int indexOfMin = startIndex;
		for (int index = startIndex + 1; index < a.length; index++) {
			if (a[index] < min) {
				min = a[index];
				indexOfMin = index;
			}
		}
		return indexOfMin;
	}

	private static void interchange(int i, int j, int[] a) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int index = 0; index < a.length - 1; index++) {
				if (a[index] > a[index + 1]) {
					interchange(index, index + 1, a);
				}
			}
		}
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
