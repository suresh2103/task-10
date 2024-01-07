package task10;

public class HerbalTea extends Tea{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HerbalTea obj = new HerbalTea();
		obj.prepareTea();
		obj.addSugar();

	}

	public void prepareTea() {
		System.out.println("Prepare a Herbal tea with hot water and tea leaves");
	}


}
