public class Main {
	public static void main(String[] args) {
		int total = 0;
		a: for (int i = 0; i < 5; j++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) countinue a;
				if (3 < j) break b;
				total += j;
			}
		}
		System.out.println(total);
	}

}
