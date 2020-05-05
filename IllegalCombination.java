
public class IllegalCombination {

	public static void main(String[] args) {
		 qwerty obj = new qwerty();
		 obj.m2();

	}

}

abstract class Abs{
	
	abstract void m2();
	
}

class qwerty extends Abs{
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("ABs2 is running");
	}
	
	void m1()
	{
		System.out.println("ABs is running");
	}

	
	
}