class A {}

class B extends A {
	void hello() {
		System.out.println("hello");
	}
}

public class Main {
	public static void main(String[] args) {
		A a = new B();
		######
		b.hello();
	}

}



A. A b = a;
B. A b = new B();
C. A b = (A) a;
D. B b = a; 
E. B b = (A) a;
F. B b = (B) a;