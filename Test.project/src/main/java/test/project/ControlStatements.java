package test.project;

public class ControlStatements {
	//control statements used to run 
	//if is used for true or false statements 
	//if else condition 
	//if elseif if elseif
	//switch used to execute single statement from multiple conditions
	static int a=11;
	static int b=10;
	public static void greaterNumber() {
		
		if(a>b) {
			System.out.println("a is greater .......");
		}
		else if(b>a){
			System.out.println("b is greater .......");
		}
		else {
			System.out.println("Both are equal............!");
		}
		
		
	}
	
	public static void switchStatement() {
		
		int day=4;
		switch (day) {
		case 0:
			System.out.println("Today is Sunday...!");
			break;
		case 1:
			System.out.println("Today is Monday..");
			break;
		default:
			System.out.println("Today is Neither Sunday nor Monday.....!");
			break;
		}
	}
	public static void main(String args[]) {
		
		ControlStatements.greaterNumber();
		ControlStatements.switchStatement();

	}

}
