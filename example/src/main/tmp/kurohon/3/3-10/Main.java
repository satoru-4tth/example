
public class Main {
	public static void main(String[] args) {
		Object a = new Sample(10);
		Object b = new Sample(10);
		System.out.println(a.equals(b));
	}

}


// コンパイル、実行したときの結果として、正しいものを選びなさい。（１つ選択）
/*
A. Sampleクラスでコンパイルエラーが発生する。
B. Mainクラスでコンパイルエラーが発生する。
C. 「true」と表示される
D. 「false」と表示される
E. 実行時に例外がスローされる
*/