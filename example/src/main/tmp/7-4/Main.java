public class Main {
	public static void main(String[] args) {
		String s = null;
		try {
			int i = Integer.parseInt(s);
			System.out.println(s);
		} catch ( /* insert code here */ ) {
			System.out.println("exception");
		}
	}
}


// A. ClassCastException e
// B. NumberFormatException e
// C. NullPointException ex
// D. RuntimeException ex
// E. ArithmeticException ex