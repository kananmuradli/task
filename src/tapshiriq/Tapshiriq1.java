package tapshiriq;

import java.util.Scanner;

public class Tapshiriq1 {

	public static void main(String[] args) {//verilmish edede qederki ededlerden 2ye bolunenleri capa vermeli
		Scanner sc = new Scanner(System.in);	
		System.out.println("Ededi daxil edin!");
		int value = sc.nextInt();
		for(int i = 0; i<=value; i++) {
			if(i % 2 ==0)
				System.out.println(i);
		}

	}

}
