public class Week3Assignment {

	public static void main(String[] args) {
		
		// 1)array for ages
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 108
		}; 
		
		// a)subract the value of the first element for the value of the last
		int lastAge = ages[ages.length -1];
		System.out.println(lastAge - ages [0]); //returns 90
		
		// b)add new age and repeat to ensure it is dynamic
		System.out.println(lastAge - ages [0]); // added 108, returns 105
		
		// c)use loop to iterate through array, calculate average age, print result
		int sum = 0;
			for (int age : ages) {
				sum += age;
			}
		System.out.println("The average age is " + sum / ages.length);
		
		// 2)array for String
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
				
		// a)loop to iterate through array and calculate average number of letters per name
		double averageLetters = 0;
		  for (String name : names) {
			  averageLetters += name.length();
		  }
		System.out.println("The average number of letters per name is " + averageLetters / names.length);
	
		
		// b)use a loop to iterate through the array and concatenate all the names separated by spaces
		String allNames = ""; 
			for (String name : names) {
			allNames += name + " ";
			}
		System.out.println("Here's a bunch of names: " + allNames);
		
	
	
		// 5)array nameLengths, loop over previous names array and add length of each name to nameLengths array
		System.out.println("The lengths of the String names are: ");
		int[] nameLengths = new int[names.length];
		for (int x = 0; x < names.length; x++) {
			nameLengths[x] = names[x].length();
			System.out.print(nameLengths[x] + " ");	
		}
		
		
			
		// 6)loop iterate over the nameLenghts array and calculate the sum of all elements in the array
		int sumOfNameLengths = 0;
			for (int name : nameLengths) {
			sumOfNameLengths += name;
			}
		System.out.println("\n" + "The sum of the name lengths is: "+ sumOfNameLengths);
			
		System.out.println(createWordRepeat("banana", 7)); // print statement for part 7
		
		System.out.println("My full name is " + createFullName("Lee", "Blanchard")); // print statement for part 8
			
		System.out.println("Is the sum of the array greater than 100? " + (isGreaterThan100(ages))); //print statement for part 9
			
		int [] daysPerMonth = {31, 29, 31, 30, 31, 30 , 31, 31, 30, 31, 30, 31}; //array for part 10
		System.out.println("This is the average of days per month: " + isTheAverage(daysPerMonth)); //print statement for part 10
	
		double [] costOfSnacks = {1.34, 2.75, 3.45, 1.27}; //arrays and print statement for part 11
		double [] costOfDrinks = {2.22, 1.89, 2.25, 1.85};
		System.out.println("Is the average cost of snacks greater than the average cost of drinks? " + isGreaterThan(costOfSnacks, costOfDrinks)); //print statement for part 11
	
		boolean isHotOutside = false; //data types and print statement for 12
		double moneyInPocket = 12.58;
		System.out.println("Will I buy a drink? " + willBuyDrink(isHotOutside, moneyInPocket));
		
		boolean areStinky = true;
		boolean beenAWeekSinceLastBath = false;
		System.out.println(shouldGiveABath(areStinky, beenAWeekSinceLastBath));
	}
	/* 7)method takes string, word, and an int, n, as an argument and
	returns word concatenated to itself n number of times */
	public static String createWordRepeat(String word, int num)	{
		
		String wordRepeat = "";
		for (int x = 0; x < num; x++) {
			wordRepeat += word;
		}
		return wordRepeat;
	}
	/* 8)method that takes two Strings, firstName and lastName
	and returns a full name */
	public static String createFullName(String firstName, String lastName) {
		
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	/* 9)method that takes an array of int and returns true if the
	sum of all ints int the array is greater than 100 */
	public static boolean isGreaterThan100(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum > 100;
	}	
	/* 10)method that takes an array of double and returns the average
	of all the elements in the array */
	public static double isTheAverage(int[] element) {
		double sum = 0;
		for (int x : element) {
			sum += x;
		}
		return sum / element.length;
	}

	/* 11)method that takes two arrays of double and returns true if the
	average of the elements in the first array is > than the average of
	the elements in the second array */
	public static boolean isGreaterThan(double[] element1, double[] element2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double x : element1) {
			sum1 += x;
		}
		for (double x : element2) {
			sum2 += x;
		}
		return (sum1 / element1.length) > (sum2 / element2.length);
	}
		
	/* 12)method called willBuyDrink that takes a boolean isHotOutside and
	a double moneyInPocket, and returns true if it is hot outside and if
	moneyInPocket is > 10.50 */
	public static boolean willBuyDrink(boolean x, double y) {
		return (x == true && y > 10.50); 
	}
	
	/* 13)method of my own that solves a problem(write here what it does and why
		I created it */
	
	// String Method to decide if my dogs need a bath if boolean of areStinky or beenAWeekSinceLastBath are true
	public static String shouldGiveABath(boolean x, boolean y) {
		if (x || y) {
			return("Looks like it's time for a bath.");
			}
		
		else {
			return("No bath for you.");	
		}
	}
}
	
	

