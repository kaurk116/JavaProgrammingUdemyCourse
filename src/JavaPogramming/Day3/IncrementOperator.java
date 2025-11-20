package JavaPogramming.Day3;

public class IncrementOperator {

	public static void main(String[] args) {
		
		/*int a=10;
		 a=a+1;
		//a++;
		System.out.println(a);*/
		
		
		// post increment
		int a=10;
		int res=a++;
		System.out.println(res); //10
		System.out.println(a); //10

		
		// pre increment
			int b=20;
			int resb=++b;
			System.out.println(resb); //21
		System.out.println(b); //21

		
		
	}

}
