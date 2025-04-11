public class A {
	public void test() {
		System.out.println("A");
	}
}

public class B extends A {
	@Override
	public void test() {
		System.out.println("B");
	}
}

public class Sample {
	public static void  main(String[] args) {
		A[] array = {new A(), new B(), new A(), new B()};
		for (A a : array) {
			if (a instanceof B b) {
				a.test();
			} else {
				b.test();
			}
		}
	}

}
