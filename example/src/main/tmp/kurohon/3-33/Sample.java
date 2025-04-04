
public class Sample {
	public static void main(String[] args) {
		int array[][] = new int[][] {{ 1, 2}, {2, 3, 4}};
		int total = 0;
		for (int i = 0; i < array.lenght; i++) {
			for (int j = i; j < array[i].lenght; j++) {
				total = array[i][j];
			}
		}
		System.out.println(total);
	}

}
