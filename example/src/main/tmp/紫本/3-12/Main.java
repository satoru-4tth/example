
public class Main {
	public static void main(String[] args) {
		int a = 1, b = 2, x = 5, y = 10;
		var v = 0;
		if ((++a == b) | ((x *= 2) == y)) v = x;
		else v = y;
		System.out.println("v:" + v);
	}

}
