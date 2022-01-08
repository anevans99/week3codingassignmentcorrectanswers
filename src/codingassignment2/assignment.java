package codingassignment2;

public class assignment {

	public static void main(String[] args) {


		
//invoking method from q.9
		double[] prices = new double[4];
		prices[0] = 22.57;
		prices[1] = 13.67;
		prices[2] = 15.98;
		prices[3] = 25.45;
		
		System.out.println(calculateAverage(prices));
		
//invoking method from q.6
	System.out.println(multiplyString("Hello", 3));
	
//invoking from q. 7
	String firstName = "Aurora";
	String lastName = "Evans";
		String fullName = createFullName(firstName, lastName);

		System.out.println(fullName);
//invoking from q. 11
		boolean isHotOutside = true;
		double moneyInPocket = 11.50;
		System.out.println("willBuyDrinktest" + " " + willBuyDrink(isHotOutside, moneyInPocket));
		
//invoking from q 12
		int[] grades = new int [4];
		grades[0] = 80;
		grades[1] = 90;
		grades[2] = 100;
		grades[3] = 50;
		
		System.out.println(pickBestGrade(grades));
	
		
		//invoking from q.8 used array from below (ages)
		System.out.println(isGreaterThan100(grades));		
	
	//invoking from q.10
		double[] array1 = new double[4];
		array1[0] = 22.58;
		array1[1] = 13.69;
		array1[2] = 18.98;
		array1[3] = 45.45;
		
	System.out.println(calculateAverageof2Arrays(prices, array1));
		
		// TODO Auto-generated method stub
//1.1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.

int[] ages = new int[] {3,9,23,64,2,8,28,93, 83};
System.out.println(ages[ages.length - 1] - ages[0]);
int sumOfArray = 0; 
for(int i = 0; i < ages.length; i++) { 
sumOfArray += ages[i];
	} int average = sumOfArray/ages.length;
	System.out.println("the average for question 1 is " + average);

	


////2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//	a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//	b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.

String[] names = new String[6];
names[0] = "Sam";
names[1] = "Tommy";
names[2] = "Tim";
names[3] = "Sally";
names[4] = "Buck";
names[5] = "Bob";

int total = 0; 
for(String name: names) {
	total += name.length();
} int nameAverage = total/names.length;
System.out.println(nameAverage);


String allNames = "";
for (int i = 0; i < names.length; i++) {
	allNames += names[i] + " ";
}
System.out.println(allNames);
//3.	How do you access the last element of any array?
//-In order to find the last element in an array you can use the get(index) method and subtract 1. Ex. int last = list.get(list.size() -1);
//4.	How do you access the first element of any array?
//-To get the first element in an array you can use the get(index) method and pass 0 into the method. Ex. int first = list.get(0);

//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
int[] nameLengths = new int[names.length];
for (int i = 0; i < names.length; i++) {
	nameLengths[i] = names[i].length();
	
}
int sum = 0; {
for (int i = 0; i < nameLengths.length; i++) {
	sum += nameLengths[i];
}
System.out.println("The sum of all lengths in nameLengths[] = " + sum);
}	
	}
//6. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
public static String multiplyString(String str, int num) {
String result = "";
	for (int i = 0; i < num; i++) {
		result += str;
	}
return result;
}


//7. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

public static String createFullName(String x, String y) {
	return x + " " + y;
	}

//8.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
public static boolean isGreaterThan100(int[] numbers) {
int sum = 0;
	for (int value : numbers) {
		sum += value;
	}
return (sum > 100);
}
//9.	Write a method that takes an array of double and returns the average of all the elements in the array	
public static double calculateAverage(double[] numbers) {
double sum = 0;
for (double number : numbers) {
	sum += number;
}
return sum / numbers.length;
	}

//10.	Write a method that takes two arrays of double and returns true if the average of the elements in the first
//array is greater than the average of the elements in the second array.
public static boolean calculateAverageof2Arrays(double[] array1, double[]array2)	{
	if (calculateAverage(array1) > calculateAverage(array2)) { 

	return true;
	} else {
	return false;
	}
}
//11.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket,
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
 

if (moneyInPocket > 10.50 && isHotOutside == true) {
return true;
} else {
	return false;

}
}

//12.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// This method will find the best average grade of a student in a class. I created it so 

public static int pickBestGrade(int[] grades) {
	int bestGrade = grades[0];
	for (int grade: grades) {
		if (grade > bestGrade) {
			bestGrade = grade;
		}
	} 
	return bestGrade;
}
	
	
	    
}


	
