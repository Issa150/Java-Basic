package first_java;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
		// To store refrence data type
		//ArrayList<String> food = new ArrayList<String>();
		/*//Simple Array list
		food.add("Pizza");
		food.add("Kebqb");
		food.add("Sandzich");
		
		
		//food.set(0, "Sushi");
		//food.remove(2);
		
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		*/
		
		// 2D Array List
		ArrayList<ArrayList<String>> electronicShop = new ArrayList();
		
		ArrayList<String> phones = new ArrayList<String>();
		phones.add("Samsung");
		phones.add("Xiaomi");
		phones.add("Apple");
		
		ArrayList<String> tablets = new ArrayList<String>();
		phones.add("Ipad");
		phones.add("Galaxy tab S");
		phones.add("Mi pad");
		
		ArrayList<String> smartWatches = new ArrayList<String>();
		smartWatches.add("Galaxy Watch");
		smartWatches.add("Mi watch");
		smartWatches.add("Apple watch");
		
		electronicShop.add(phones);
		electronicShop.add(tablets);
		electronicShop.add(smartWatches);
			
		// to get all of it contents
		System.out.println(electronicShop);
		// to get one specific items 
		System.out.println(electronicShop.get(0).get(0));

	}

}
