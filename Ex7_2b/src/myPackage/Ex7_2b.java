package myPackage;

public class Ex7_2b {
	public static void main(String[] args) {
		double[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		System.out.println("array");
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("sum = " + getSum(arr, 2));
		System.out.println("average = " +getAverage(arr, 2));

	}

	public static double getSum(double[][] arr, int row) {
		double sum = 0;
		for (int i = 0; i < arr[row].length; i++) {
			sum += arr[row][i];
		}
		return sum;
	}

	public static double getAverage(double[][] arr, int column) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][column];
		}
		return sum / arr.length;
	}
}
