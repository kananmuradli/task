package tapshiriq;

import java.util.Scanner;

public class Tapshiriq5 {

	public static void main(String[] args) {//factorial for-suz hellinin tapilmasi.

		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int value = sc.nextInt();
		int result = 1;
		System.out.println(Tapshiriq5.fact(value));
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * fact(n - 1));
		}

	}
}
