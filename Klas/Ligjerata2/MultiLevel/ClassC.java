public class ClassC extends ClassB{
	
	public void printoC(){
		System.out.println("Klasa C");
	}
	
	
	public static void main(String[]args){
		ClassC c = new ClassC();
		c.printoA();
		c.printoB();
		c.printoC();
		
		ClassB b = new ClassB();
		b.printoA();
		b.printoB();
	//	b.printoC(); // error
		
		ClassA a = new ClassA();
		a.printoA();
		//a.printoB();
		//a.printoC();
		
	}
	
}