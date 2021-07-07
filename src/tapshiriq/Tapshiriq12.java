package tapshiriq;

public class Tapshiriq12 {
//a qeder c simvolunu chap etsin. altAlta deyişeni true-dursa altAlta eks halda yan yana chap etsin
	public static void main(String[] args) {
		psm(5, 'A', false);

	}
	public static void psm(int chapSayi, char symbol, boolean altAlta) {
		for (int i = 0; i < chapSayi; i++) {
			if (altAlta) {
				System.out.println(symbol);
			}else {
				System.out.print(symbol);
			}
		}

	}
}
