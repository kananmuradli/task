package tapshiriq;

import java.util.Scanner;

public class Tapshiriq11 {
//scanner ile int massivi doldurulur ve metoda oturulur.eger ededler artan ardicilliqla verilibse, geriye true qaytarsin eks halda false.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("uzunlugu daxil et:");
		int arrLength = sc.nextInt();

		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ededleri daxil et:");
			arr[i] = sc.nextInt();
		}

		boolean netice = method(arr);
		System.out.println("netice=" + netice);
	}

	public static boolean method(int[] arr) {
		boolean netice = true;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return netice;
	}

}
