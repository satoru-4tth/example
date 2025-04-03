
public class Main {
	public static void main(String[] args) {
		try (MyResource resource = new MyResource()) {
			System.out.print("A");
		} finally {
			System.out.print("B");
		}
	}
class MyResource {
	public MyResource() {
		System.out.print("C");
	}
	public void close() {
		System.out.print("D");
	}
}
