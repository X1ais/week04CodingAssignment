package com.promineo;

import java.util.HashMap;
import java.util.Map;

public class CodingAssignment {

	public static void main(String[] args) {
		
		// Question 1
		///////////////////////////////////////
		
		// Create an Array of ints
		int[] ages = {3,9,23,64,2,8,28,93};
		
		//Part a: Subtract first element from the last
		ages[ages.length - 1] -= ages[0];
		
		// Print out elements of the array
		printIntArray(ages);
		
		// Part b: Create a new array
		int[] ages2 = {39,82,5,7,2,46,32,25,86};
		
		//Call minusFirstFromLast on the second array
		ages2[ages2.length - 1] -= ages2[0];
		printIntArray(ages2);
		
		// Part c: Iterate through the array and print the average
		double mean = takeMean(ages);
		System.out.println("The average age from 'ages' is " + mean);
		
		// Question 2
		///////////////////////////////////////
		
		// Create an array of names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// Part a: Calculate the average letters per name and print it to console
		double aveLetters = averageLetter(names);
		System.out.println("The average number of letters in the 'names[]' array is " + aveLetters);
		
		// Part b: Print each name concatenated together in a single line.
		String combinedNames = combineStringWithSpace(names);
		System.out.println("The names stored in the 'names[]' array are: " + combinedNames + ".");
		
		// Question 3: How do you access the last element of any Array?
		// The last element of any array is accessed using the index 'array.length - 1' (e.g. array[array.length - 1])
		System.out.println("The last element of the 'names[]' array is " + names[names.length - 1] + ".");
		
		// Question 4: How do you access the first element of any Array?
		// The first element of any array is accessed using the index of '0'(e.g. array[0])
		System.out.println("The first element of the 'names[]' array is " + names[0] + ".");
				
		// Question 5
		
		// Create an array of type int called nameLengths.
		int[] nameLengths = new int[names.length];
		
		// Iterate through nameLengths and store the value of the number of letters in each element of names
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// Question 6
		
		// Loop through nameLengths and calculate the sum of all elements.
		// Initializing count variable to hold the sum through loop
		int count = 0;
		
		// The variable count will add each integer to itself as the for loop runs through each element of nameLengths
		for (int n : nameLengths) {
			count += n;
		}
		
		// Printing 'count' to the console with some text to make it read pretty.
		System.out.println("The sum of all elements in 'nameLengths[]' is " + count + ".");
		
		// Question 7
		
		// Write a method to concatenate a word a certain number of times to itself
		// Declaring a string and integer variable and initializing them with the values 'Hello' and '3' respectively
		String word = "Hello";
		int n = 3;
		
		// Let's declare a new String called newWord to hold 
		String newWord = combineStringNoSpace(word, n);
		System.out.println("The word has been concatenized and is now: " + newWord + ".");
		
		//Question 8
		
		//Write a method that returns a fullname when given a first name and last name.
		String firstName = "Chriss", lastName = "Jackson", fullName;
		fullName = fullName(firstName, lastName);
		System.out.println("The full name is " + fullName + ".");
		
		//Question 9
		
		//Write a method that counts the sum of an array of type int and returns true if it's above 100.
		boolean isGreaterThan100 = isGreaterThan100(ages2);
		System.out.println("The sum of the ages in 'ages2[]' is greater than 100: " + isGreaterThan100 + ".");
		
		//Question 10
		
		//Write a method that takes an array of double and returns the average of all the elements in the array
		double[] values = {.79,.62,.85,.290,.846,.73,.309,.189,.7646,.467,.9,.716};
		double meanOfValues = meanOfDouble(values);
		
		System.out.println("The average value of an array of doubles is: " + meanOfValues + ".");
		
		//Question 11
		
		//Write a method that compares the averages of two arrays of doubles
		double[] values2 = {.97,.948,.763,.198,.0789,.004,.497,.7,.999,.972,.187,.34};
		double meanOfValues2 = meanOfDouble(values2);
		boolean isGreater = compareMeans(meanOfValues, meanOfValues2);
		
		System.out.println("The average of values is greater than the average of values2: " + isGreater + ".");
		
		//Question 12
		
		//Write a method called willBuyDrink, a boolean called isHotOutside and check if double moneyInPocket is greater than 10.50
		
		boolean isHotOutside = true;
		double moneyInPocket = 9.76;
		
		if (willBuyDrink(isHotOutside, moneyInPocket)) {
			System.out.println("Given today's temperature and the money in my pocket, I think I will have a drink.");
		} else {
			System.out.println("I'm going to have to pass, today.");
		}
		
		//Question 13
		
		//I will be writing a method called makeDeposit that takes a Map called bankAccounts with an Integer key and a Double value, and also a double called deposit. 
		//I will first print my account balances and then deposit an amount into one of the accounts. 
		
		// Setting the variables
		Map<Integer, Double> bankAccounts = new HashMap<>();
		double deposit = 417.00;
		bankAccounts.put(19766548, 2879.16);
		bankAccounts.put(19883035, 943.76);
		bankAccounts.put(12678793, 19367.44);
		int account = 19766548;
		
		// Calling the Method
		makeDeposit(bankAccounts, account, deposit);
		
		// Printing the result
		System.out.println("Your bank account(s) have the following balances: " + bankAccounts);

		
		
	}
	

	public static void printIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	public static double takeMean(int[] arr) {
		double sum = 0.;
		for (int a : arr) {
			sum += a;
		}
		return sum/arr.length;
	}
	
	public static double averageLetter(String[] str) {
		double sum = 0.;
		for (String s : str) {
			sum += s.length();
		}
		return sum/str.length;
	}

	public static String combineStringWithSpace(String[] str) {
		String result = "";
		for (int i = 0; i < str.length; i++) {
			if (i != 0) {
				result += " ";
			}
			result += str[i];
		}
		return result;
	}

	public static String combineStringNoSpace(String word, int num) {
		String result = "";
		for (int n=0;n<num;n++) {
			result += word;
		}
		return result;
	}

	public static String fullName(String fName, String lName) {
		return fName + " " + lName;
	}

	public static boolean isGreaterThan100(int[] nums) {
		int count = 0;
		for (int n : nums) {
			count += n;
		}
		if (count > 100) {
			return true;
		} else {
			return false;
		}
	}
		
	public static double meanOfDouble(double[] dub) {
		double sum = 0;
		for (double d : dub) {
			sum += d;
		}
		return sum / dub.length;
	}
	
	public static boolean compareMeans(double a, double b) {
		return a > b;
	}

	public static boolean willBuyDrink(boolean hot, double money) {
		if (hot && money > 10.50) {
			return true;
		} else {
			return false;
		}
	}

	public static void makeDeposit(Map<Integer, Double> accs, int accNum, double dep){
		double newTotal = accs.get(accNum) + dep;
		accs.put(accNum, newTotal);
	}
}
