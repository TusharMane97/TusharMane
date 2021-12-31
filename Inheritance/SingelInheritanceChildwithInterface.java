package inheritance;

public class SingelInheritanceChildwithInterface extends SingleInheritanceParentWithInterface {

public static void multiplication(int a, int b) {
		
		int c = a*b;
		System.out.println("Multiplication ="+c);
		}
	
public static void main(String[] args){
						  
	SingleInheritanceParent obj = new SingleInheritanceParent();		
	obj.addition(40,10);
	obj.subtraction(15,7);

	SingleInheritanceChild child = new SingleInheritanceChild();		
	child.multiplication(2,3);
	child.addition(40,30);
	child.subtraction(15,7);
	
	SingleInheritanceParent parentChild = new SingleInheritanceChild();		
	parentChild.addition(100, 120);
	parentChild.subtraction(53, 12);
		
}
}
