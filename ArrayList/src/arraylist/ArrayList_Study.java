package arraylist;
import java.util.ArrayList;

public class ArrayList_Study {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] fruits = new String[3];
		fruits [0]="Mango";
		fruits [1]="Apple";
		fruits[2] ="Strawberry";
		System.out.println("Arry with Index");
		System.out.println(fruits[2]);
		System.out.println("------------");
		
		System.out.println("Arry without Index");
		System. out. println(fruits);
		System.out.println("------------");

		ArrayList<String> fruitList = new ArrayList<String>();
		fruitList.add("Mango");
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Watermelon");
		System.out.println("ArrayList .Add");
		System.out.println(fruitList);  
		System.out.println("------------");
		
		System.out.println("With fruitList.contains");
		System.out.println(fruitList.contains("Avocado"));
		System.out.println("------------");
		
		ArrayList<String> colorList = new ArrayList<String>();
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add("Red");
		colorList.add("Purple");		
		System.out.println(".Remove-\"Red\"");  
		colorList.remove("Red");
		System.out.println(colorList);  
		System.out.println("------------");
		
		ArrayList<String> clearArray = new ArrayList<String>();
		clearArray.add("01");
		clearArray.add("02");
		clearArray.add("03");
		clearArray.add("04");
		
		System.out.println(".Clear-\"ArrayList\""); 
		clearArray.clear();
		System.out.println(clearArray);  			
	}
}
