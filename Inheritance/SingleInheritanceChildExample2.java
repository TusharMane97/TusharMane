package inheritance;

public class SingleInheritanceChildExample2 extends SingleInheritanceParentExample2 {
	
	public void cycle() {
		System.out.println("Atlas");
	}
	
	public static void main(String[] args) {
		
		SingleInheritanceParentExample2 parent = new SingleInheritanceParentExample2();
		parent.bike();
		parent.car();
		
		SingleInheritanceParentExample2 parent1 = new SingleInheritanceChildExample2();
		parent1.bike();
		parent1.car();
		
		SingleInheritanceChildExample2 child = new SingleInheritanceChildExample2();
		child.bike();
		child.car();
		child.cycle();
		
	
		
		
	}

	
}
