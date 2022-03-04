package test.project;

public class Test1 {
	static int a=4;
	static int b=5;
	static int sum;
	static int dif;
	static int mul;
	static int div;
	
	public static void sum() {
		
		sum=a+b;
		System.out.println("Sum : "+sum);
	}
public static void difference() {
		
		dif=a-b;
		System.out.println("Sum : "+dif);
	
	}
	public static void multiplication() {
		
		mul=a*b;
		System.out.println("multiply : "+mul);
		
	}
public static void division() {
		
		div=a*b;
		System.out.println("multiply : "+div);
		
	}

	public static void main(String[] args) {
		Test1.sum();
		Test1.difference();
		Test1.multiplication();
		Test1.division();

	}

}
