public interface A {}

public class B implements A {}

public class C extends B {}

public class D {}


public class Main {
	public static void main(String[] args) {
		A[] array = {
				new B(),
				new C(),
				new A(),
				new D()
		};
	}

}
