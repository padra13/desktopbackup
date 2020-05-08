/**
 * 
 */
package zooland;


import java.util.*;
/**
 * @author padra
 *
 */
public class PetShop {

	private final static Scanner sc = new Scanner(System.in);
	
	public static String userIn="";

	public final static Random rand = new Random();
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Animals> animalsList = new  ArrayList<>();;

		Integer petidnum = rand.nextInt(999999999);
		
		Map<Integer, Animals> stock = new HashMap<>();

	
		boolean keepGoing=false;


	System.out.println("DO you want to add a record? (y/n)");
		
		userIn = sc.next();

		if(userIn.equalsIgnoreCase("y")) {
			
		do {
			
			Animals cataloguenum = addANewAnimal();
			
	
			System.out.println("Adding to list");	
			addToList(stock,cataloguenum);
			
			
			System.out.println("add another? (y/n)");
			
			String in = sc.next();
			
			if(in.equalsIgnoreCase("y")) {
				keepGoing=true;
			}else {
				System.out.println("All Done... ");
				break;
			}
			
			
		}while(keepGoing==true);
		
		}
		
		
		System.out.println("Do you want to see stocklist? (y/n)");
		
		userIn = sc.next();
		if(userIn.equalsIgnoreCase("y")) {
			showStoreRoom(stock);
		}
		
		
		
	}

	
	
	public static void showStoreRoom(Map<Integer,Animals> stockList) {
		
		System.out.printf("%-20S:%-20S\n","PET ID", "PET DETAILS");
		for(Integer a : stockList.keySet()) {
			
			System.out.printf("%-20d:%-20S\n",a, stockList.get(a));
	
			
			
		}
		
		
		
	}
	
	
	public static void addToList(Map<Integer, Animals> list, Animals animal) {
		

		Integer petidnum = rand.nextInt(999999999);
		
				
		list.put(petidnum,animal);
		
		
		System.out.println("Added successfully...");
		
		
		System.out.println("looking in storeroom..");
	}
	
	
	
	public static Animals addANewAnimal() {
		
		System.out.println("What animal to you want to add?");

		userIn = sc.next();
		
		
		switch (userIn) {
		case "cat":
			System.out.println("You choose a cat");
			
			System.out.println("Enter a name");
			String name = sc.next();
			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Enter Breed");
			CatBreed breed = CatBreed.MAINECOON;
			
			Cat c = new Cat(name,age,breed);
			
			System.out.println("You created ... ");
			System.out.println(c.toString());
			
			return c;
			
			
		case "dog":
			System.out.println("You choose a dog");
		

			System.out.println("Enter a name");
			String dogname = sc.next();
			System.out.println("Enter age");
			int dogage = sc.nextInt();
			System.out.println("Enter Breed");
			DogBreed dogbreed = DogBreed.HUSKY;
			
			Dog d = new Dog(dogname, dogage, dogbreed);
			
			return d;

		default:
			System.err.println("Error, please try again");
			
			break;
		}
		return null;
		
	}
	
	
}
