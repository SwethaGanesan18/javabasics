package revise;

public class Overloading {

	public void studentname (String name) {
		System.out.println(name);
	}
	public void studentname (int age) {
		System.out.println(age);
	}


	public static void main(String[]args) {
		
		Overloading obj = new Overloading ();
		obj.studentname("sandy");
		obj.studentname(23);
		
	}
}
