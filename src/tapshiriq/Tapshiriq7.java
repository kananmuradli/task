package tapshiriq;

import java.util.Scanner;

public class Tapshiriq7 {
//methoda daxil edilen reqemin musbet,menfi ve ya 0 oldugunu teyin eden method yazin.Eger menfidirse geriye -1; musbetdirse 1; 0dirsa 0qaytarsin 
	public static void main(String[] args) {
		int netice = psm(78);
		System.out.println("netice="+netice);
	}

	public static int psm(int a) {
		if (a == 0) {
			return 0;
		} else if (a > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
