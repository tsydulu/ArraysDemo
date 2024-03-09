package practice;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// duplicates();
		// noOfRepeated();
		sortAscending2();
	}
	
	public static void sortAscending2() {
		int[] arr = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		int[] arr1 = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		//x = x + y;
		//y = x - y;
		//x = x - y;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i] =arr[i]-arr[j];
				}
				System.out.println(Arrays.toString(arr));
			}
			//System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr[3]);
		System.out.println(arr[arr.length-3]);

		
	}

	public static void sortAscending() {
		int[] arr = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		int[] arr1 = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void noOfRepeated() {
		int[] arr = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		int[] arr1 = { 20, 20, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 2, 99 };
		int count = 0;
		boolean flag = true;
		int temp[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					temp[count++] = arr[i];
					arr[i] = 0;
				}
			}
		}
		int finalArr[] = new int[arr.length - count];
		System.out.println(Arrays.toString(arr));
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				finalArr[k++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(finalArr));

		System.out.println(count);
		System.out.println(Arrays.toString(temp));

		for (int i = 0; i < arr.length - finalArr.length; i++) {
			System.out.print(temp[i] + " ");
		}
	}

	// with sort and one for loop
	public static void duplicates() {

		int[] arr = { 20, 2, 2, 10, 55, 99, 1, 3, 4, 10, 4, 3, 20, 99 };
		Arrays.sort(arr);
		int dupArr[] = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				dupArr[count] = arr[i];
				arr[i] = 0;
				count++;
			}
		}
		// System.out.println(Arrays.toString(dupArr));
		// System.out.println(Arrays.toString(arr));
		System.out.println("count= " + count);

		System.out.println("Duplicates in the array");
		for (int i = 0; i < count; i++) {
			System.out.print(dupArr[i] + " ");
		}

		int originArr[] = new int[arr.length - count];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				originArr[k++] = arr[i];
			}
		}
		System.out.println("\nThe array with no duplicates");
		System.out.println(Arrays.toString(originArr));

	}

}
