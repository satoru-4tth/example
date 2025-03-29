
public class Main {
	public static void main(String[] args) {
		int a = 10, b = 10, x, y;
		x = ++a;
		y = b--;
		int val = y < --x ? x++ : ++y;
		System.out.println("val:" + val);
	}

}
