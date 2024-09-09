package revise;

public class Alltriangles {
	
	public static void main(String[]args) {
	// triangle1:
	
			for(int a=1; a<=5; a++) {
				for(int b=1; b<=a; b++) {
					System.out.print("*");
				}System.out.println();
			}
			
			// triangle 2:
			
			for(int c=1; c<=5;c++) {
				for(int d = 5; d>=c;d--) {
					System.out.print("*");
				}System.out.println();
			}

}
}
