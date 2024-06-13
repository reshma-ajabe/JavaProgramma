package Testpackage;

public class ConcreteClass extends Abstractclass{
	
	public void method2() {
		System.out.println("I am sona");
	}
	
	public static void main(String[] args) {
		ConcreteClass x=new ConcreteClass();
		x.method2();
		Abstractclass.method1();
		
	}
	
	
	

}
