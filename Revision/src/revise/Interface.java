
package revise;

public class Interface implements Bankinginterface {
	
	
	public void saving() {
		System.out.println("sandy");
	}
	public void current() {
		System.out.println("kuzhali");
	}
	public void fixed() {
		System.out.println("ramya");
	}
public static void main(String[]args) {
	Interface obj = new Interface();
	obj.current();
	obj.saving();
	obj.fixed();
}
}
