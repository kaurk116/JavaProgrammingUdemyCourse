package JavaPogramming.Day16;

public class MultipleInheritance implements Interface_1, Interface_2
{

	public void m1()

	{
		System.out.println(" this is m1...");
	}
	
	public void m2()
	{
		System.out.println("this is m2...");
	}
	
	public static void main(String[] args) {
		
		MultipleInheritance mi=new MultipleInheritance();
		mi.m1();
		mi.m2();
		
		System.out.println(mi.x);
		System.out.println(mi.y);
		
		

	}

}
