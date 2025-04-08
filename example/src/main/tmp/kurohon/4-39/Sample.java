public record Data(String value) {
	public Data {
		if (this.value == null) {
			System.out.println("value is null");
		}
	}
}


public class Sample {
	public static void main(String[] args) {
		Data data = new Data(null);
		System.out.println(sata.value());
	}

}
