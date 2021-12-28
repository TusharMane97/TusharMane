package patternPrograms;

public class CharacterPattern {

	public static void main(String[] args) {
		
		char ch = 'a';
		
			for (int i = 0 ; i < 5 ; i++) {
			
				for (int j = 4 ; j >= i ; j--) {
					
					System.out.print(ch); 		
					
				}
				
				System.out.println();
				ch++;  							
			}
}
	
}
