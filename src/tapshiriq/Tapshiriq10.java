package tapshiriq;

import java.util.Scanner;

public class Tapshiriq10 {
//scanner ile int massivi doldurulur.ve metoda oturulur eger massivde her hansi 2 element bir birine beraber olarsa geriye true qaytarsin.eks halda false.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("massivin uzunlugnu daxil et:");
		int arrLength = sc.nextInt();

		int arr[] = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ededi daxil et:");
			arr[i] = sc.nextInt();
		}
		boolean netice = method(arr);
		System.out.println("netice=" + netice);
	}

	public static boolean method(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					return true;
				}
			}
		}
		return false;
	}
}
