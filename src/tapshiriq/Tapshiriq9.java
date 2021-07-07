package tapshiriq;

import java.util.Scanner;

public class Tapshiriq9 {
//scanner ile int massivi doldurulur ve bu massiv methoda otrulur.method bu massivdeki ededleri toplayir ve geriye qaytarir.meselen {123}method return edecek 6
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("massivin uzunlugunu daxil edin:");
		int arrLength = sc.nextInt();

		int arr[] = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ededi daxil edin:");
			arr[i] = sc.nextInt();
		}
		int netice = method(arr);
		System.out.println("netice=" + netice);
			
	}

	public static int method(int[] arr) {
		int netice = 0;
		for (int i = 0; i < arr.length; i++) {
			netice += arr[i];
		}
		return netice;
	}

}
