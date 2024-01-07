package task10;

class Person {

	String name;
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person obj = new Person();

		obj.setName("Karthik");
		obj.setAge(30);

		String name = obj.getName();
		int age = obj.getAge();

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
