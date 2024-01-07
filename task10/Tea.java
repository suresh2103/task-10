package task10;

public class Tea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tea obj = new Tea();
		
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();

	}

	
	public void prepareTea() {
		System.out.println("Prepare a basic tea with hot water and tea leaves");
	}
	public void addMilk() {
		System.out.println("Add milk to the basic tea");
	}
	public void addSugar() {
		System.out.println("Add sugar to the tea");
	}
	
	
	
	
}
