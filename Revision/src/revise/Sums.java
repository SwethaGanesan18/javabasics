package revise;

public class Sums {

	public static void main (String[]args) {
		
		//Tri
		
		for (int tri=1;tri<=4;tri++) {
			for (int loop=1; loop<=tri; loop++) {
				System.out.print("*");
				
			}System.out.println();
		}

		// PALINDROME
		
		int a=142, b=0, c=0;
		while(a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			
					
		}
		if (a==c) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		
		//COUNTING PALINDROME
		
		int count=0;
		for(int d=1; d<=1000;d++) {
			int e=d,f=0,g=0;
			
			while(e>0) {
				f=a%10;
				g=(g*10)+f;
				e=e/10;
				
						
			}if (d ==g ) {
				count++;
			}
		}System.out.println(count);
		
		
		//Factorial
		int i=1;
		for(int h=1;h<=10;h++) {
			i=i*h;
		}System.out.println(i);
		
		
		
		//Fibanacci series
		
		int j=0, k=1;
		
		System.out.println(j);
		System.out.println(k);
		for(int no=2;no<=10;no++) {
			int l=j+k;
			System.out.println(l);
			j=k;
			k=l;
		}
		  
		}
		
	}
	

