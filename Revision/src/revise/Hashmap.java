package revise;
import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[]args) {
		
		HashMap <String,String> fruit = new HashMap<String,String>();
		
		fruit.put("Mango", "sour");
		fruit.put("Strawberry", "sweet");
		fruit.replace("Mango","sour","Sour-sweet");
		fruit.remove("Mango");
		System.out.println(fruit);
		System.out.println(fruit.get("Strawberry"));
		
	}

}
