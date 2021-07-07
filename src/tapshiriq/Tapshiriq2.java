package tapshiriq;

import java.util.Scanner;

public class Tapshiriq2 {

	public static void main(String[] args) {//verilmish ededin reqemlerinin cemi.
		Scanner sc = new Scanner(System.in);
		System.out.println("ededi daxil edin!");
		int value = sc.nextInt();
		int cem = 0;
		while(value>0) {
			int qaliq = value % 10;
			value = value / 10;
			cem+=qaliq;
		}
			System.out.println("cem="+cem);
	}

}
