package task10;


public class BlackTea extends Tea{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlackTea obj = new BlackTea();
		obj.prepareTea();
		obj.addSugar();

	}

	public void prepareTea() {
		System.out.println("Prepare a Black tea with hot water and tea leaves");
	}
	
}