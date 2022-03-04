package test.project;

public class Loops {
	
	//for loop has fixed iterations
	//while loop dont have fixed iterations
	//do while used when no fixed iterations and program should run atleast once 
	//for each loop - values select/returned one by one and no increments
	static int i;
	
	public void forLoop() {
		
		for(i=0;i<5;i++) {
			System.out.println(i);
		}
	}
public void whileLoop() {
	i=3;
	while(i<10) {
		System.out.println(i);
		
		i++;
	}
		
	}
public void doWhileLoop() {
	i=8;
	
	do {
		System.out.println(i);
	}while(i<5);	
}
public void forEachLoop(){
	
	int a[]= {1,2,3,4,5};
	
	for(int i : a) {
		
		if(i==2) {
		
		System.out.println(i);
		}
	}
	}

	public static void main(String[] args) {
		
		Loops objecloopclass=new Loops();
		//Loops.forLoop();
		//Loops.whileLoop();
		//objecloopclass.doWhileLoop();
		objecloopclass.forEachLoop();
	
	}

}
