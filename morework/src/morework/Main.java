package morework;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<Integer>();

		// TODO : auto add ten random numbers between 1 - 10 to the list

		Random rand = new Random();

		int num = 0;

		for (int i = 1; i <= 6; i++) {

			num = rand.nextInt(10);
			num++;

			numbers.add(num);

		}

		List<Integer> match = new LinkedList<Integer>();

		int nums = 0;

		for (int i = 1; i <= 3; i++) {

			nums = rand.nextInt(10);
			nums++;

			match.add(nums);

		}

		
		System.out.println(numbers);
		
		
		System.out.println(match);
		
		
		List<Integer> numberMatch = new LinkedList<Integer>();
		

		for(int o=0;o<match.size();o++) {
			
			
		//	System.out.println(match.get(o));
			
			for(int i=0;i<numbers.size();i++) {
						
				
		//		System.out.println(numbers.get(i));
		
			if(match.get(o) == numbers.get(i)) {
				
				if(!numberMatch.contains(numbers.get(i))){
					
					numberMatch.add(numbers.get(i));
						
				}
				
				
			}
			
			}
			
		}
		
		System.out.println(numberMatch);
		
		
		
		
	}

}
