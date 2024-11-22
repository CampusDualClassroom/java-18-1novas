package com.campusdual.classroom;

public class Exercise18 {

	public static void main(String[] args) {

		showInlineArray(createAndInitializeArray(5));
	}

    public static int[] createAndInitializeArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
        return arr;
    }

	public static void showInlineArray(int[] arr) {
        for (int i : arr) {
			if (i == arr.length){
				System.out.println(i);
			}else{
				System.out.print(i+" ");
			}

        }
	}
}

