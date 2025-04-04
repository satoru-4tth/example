
public class Sample {
	public static void main(String[] args) {
		int a = 3;
		String result = switch (a) {
		case 1 -> "A";
		case 2 -> "B";
		case 3 -> "C";
		default -> "D";
		}
		System.out.println(result);
	}

}
