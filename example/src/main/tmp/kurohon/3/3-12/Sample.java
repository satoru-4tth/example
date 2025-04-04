
public class Sample {
	
	private final static int FLAG_A = 0b0001;
	private final static int FLAG_B = 0b0010;
	private final static int FLAG_C = 0b0100;
	private final static int FLAG_D = 0b1000;
	
	public static void main(String[] args) {
		int status = 0b1011;
		boolean result = (status ##### FLAG_C) != 0;
		System.out.println(result);
	}

}


/*
A. &
B. |
C. &&
D. ||
*/