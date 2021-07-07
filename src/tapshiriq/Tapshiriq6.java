package tapshiriq;

import java.util.Scanner;

public class Tapshiriq6 {

	public static void main(String[] args) {// verilmis ededin tersi ile duzu beraberdirmi ?
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int value = sc.nextInt();
		
		boolean isPaly = findPalyndrom(value);
		System.out.println("isPaly="+isPaly);
	}

	public static int findReverse(int value) {
		int reverse = 0;
		while(value>0) {
			reverse *=10;
			reverse += value%10;
			value = value/10;
		}
		return reverse;
	}
	
	public static boolean findPalyndrom(int value) {
		return value == findReverse(value);
		
	}

}
