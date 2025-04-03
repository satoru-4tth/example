public class Item {
	private int id;
	private String name;
	public Item() {
		this(2, "Book");
	}
	public Item(int id, String name) {
		id = id;
		name = name;
	}
	public void display() {
		System.out.println(id + ":" + name + " ");
	}
	public static void main(String[] args) {
		new Item(1, "Apple").display();
		new Item().display();
	}

}
