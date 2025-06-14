public class Sample {
	private int num;
	public sample(int num) {
		this.num = num;
	}
}




public class Main{
	public static void main(String[] args) {
		Sample s1 = new Sample(10);
		Sample s2 = s1;
		s1 = new Sample(10);
		System.out.println(s1 == s2);
	}

}
