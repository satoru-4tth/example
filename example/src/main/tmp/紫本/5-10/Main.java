 class Employee {
	 // public消した
	int id;
	String name;
	public Employee(int id) {
		this.id = id;
	}
	public Employee(String name, int id) {
		this(id);
		this.name = name;
	}
	public void showEmployeeInfo() {
		System.out.println(id + ";" + name);
	}
}
class Main {
	public static void main(String[] args) {
		Employee emp = new Employee("Duke", 0);
		emp.showEmployeeInfo();
	}
}

