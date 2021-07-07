package tapshiriq;

import java.util.Scanner;

public class Tapshiriq4 {

	public static void main(String[] args) {//factorial adi
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int value = sc.nextInt();
		int result = 1;
		
		for(int i = 1; i<= value; i++) {
			result*=i;
		}
		
		System.out.println(result);
	}

}
