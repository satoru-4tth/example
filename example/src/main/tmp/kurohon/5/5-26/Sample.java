public sealed interface Test permits A {
	void sample();
}


public abstract class A implements Test {
	abstract void hello();
}


public final class B extends A {
	@Override
	void hello() {
		System.out.println("hello");
	}
	@Override
	public void sample() {
		System.out.println("sample");
	}
}



public class Sample {
	public static void main(String[] args) {
		Test t = new B();
		t.sample();
		
		A a = (A) t;
		a.hello();
	}

}
