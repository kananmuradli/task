package tapshiriq;

import java.util.Scanner;

public class Tapshiriq8 {
//scanner ile mushteriden 3reqem isteyin ve en boyuk reqem hansidirsa onu cap edin
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("a-ni daxil et:");
		int a = sc.nextInt();
		System.out.println("b-ni daxil et:");
		int b = sc.nextInt();
		System.out.println("c-ni daxil et:");
		int c = sc.nextInt();

		int max = 0;

		if (a > max) {
			max = a;
		}
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		System.out.println("max="+max);
	}

}
