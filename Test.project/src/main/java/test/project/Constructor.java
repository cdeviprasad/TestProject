package test.project;

public class Constructor {
	
	//Name should be same as class Name
	//No return type
	//can't be static and abstract or final
	//we can overload constructor using parameterized constructors
	
	public Constructor() {
		
		System.out.println("Thanks for calling me .....!");
	}
	int rollNum;
	String name;
	
	public Constructor(int a,String name) {
		
		rollNum=a;
		
		//static used for memory management and can be accessed with in class
		//this is used as reference variable of current object
		
		this.name=name;
	}
	public void display() {
		
		System.out.println(rollNum+" "+name);
		
	}
	

	public static void main(String[] args) {
		
		Constructor object=new Constructor();
		Constructor newobject=new Constructor(15,"Dsp");
		newobject.display();
		
	}

}
