public class Sample {
	public Sample() {
		this(1);
		System.out.print(0);
	}
	public Sample(int x) {
		this(x, 2);
		this();
		System.out.print(x);
	}
	public Sample(int x, int y) {
		System.out.println(x + "" + y);
	}
    public static void main(String[] args) {
    	new Sample(3);
    }
}


