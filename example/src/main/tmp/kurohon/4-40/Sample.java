public interface Test {
	default void value() {
		System.out.println("A");
	}
}


public record Data(String value) implements Test {
	
}


public class Sample {
	public static void main(String[] args) {
		Data data = new Data("B");
		System.out.println(data.value());
	}
	

}
