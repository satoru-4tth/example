public class Sample {
	private String value;
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
}



public class Main {
	public static void main(String[] args) {
		Sample s = new Sample();
		String val = s.setValue("hello");
		s.getValue();
		System.out.println(val);
	}
}