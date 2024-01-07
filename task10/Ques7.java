package task10;

public class Ques7 extends Tea{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Tea obj;
		
		Tea T[]=new Tea[3];
		
		obj = new Tea();
		
		T[0]= new BlackTea();
		T[1]= new GreenTea();
		T[2]= new HerbalTea();
		
		T[0].prepareTea();
		T[0].addMilk();
		T[0].addSugar();
		T[1].prepareTea();
		T[2].prepareTea();
		
		

	}

}
