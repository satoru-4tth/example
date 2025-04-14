public class A {
	private int num;
	public A(int num) {
		this.num = num;
	}
	public boolean equals(Object obj) {
		A a = (A) obj;
		return this.num == a.num;
	}
}


public class B {
	private int num;
	public B(int num) {
		this.num = num;
	}
	public boolean equals(Object obj) {
		B a = (B) obj;
		return this.num == b.num;
	}
}


public class Main {
	public static void main(String[] args) {
		String str = null;
		if (str.equals("")) {
			System.out.println("blank");
		} else {
			System.out.println("null");
		}
	}

}
