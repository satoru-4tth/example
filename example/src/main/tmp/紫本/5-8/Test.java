public class Test {
	String text = "A";
	void method() {
		text = "B";
	}
	void method(String t) {
		String text = "C";
		System.out.println(text);
	}
	public static void main(String [] args) {
		String text = "D";
		Test t = new Test();
		t.method("E");
		System.out.println(t.text);
		t.method();
		System.out.println(text);
		System.out.println(t.text);
	}

}
