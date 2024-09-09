package revise;
import java.util.LinkedList;

public class Linklist {
	
	public static void main(String[]args) {
		
		LinkedList <String> cartoons=new LinkedList<String>();
		
	
		cartoons.add("doraemon");
		cartoons.add("shinchan");
		cartoons.add("jjk");
		cartoons.addFirst("jackie chan");
		cartoons.addLast("your name");
		cartoons.removeFirst();
//		cartoons.removeLast();
		System.out.println(cartoons);
		System.out.println(cartoons.getLast());
		
	}

}
