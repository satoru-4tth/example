
public class Main {
	public static void main(String[] args) {
		String s = "s";
		try {
			System.out.print(s.length()); return;
		} catch (RuntimeException e) {
			System.out.print(" catch"); return;
		} finally {
			System.out.println(" finally");
		}
	}

}
