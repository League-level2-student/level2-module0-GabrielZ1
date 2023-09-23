package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {

	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringList = {"one", "two", "three", "four", "five"};
		//2. print the third element in the array
		System.out.println(stringList[2]);
		//3. set the third element to a different value
		stringList[2] = "THREE";
		//4. print the third element again
		System.out.println(stringList[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<stringList.length; i++) {
			System.out.println(stringList[i]);
		}
		//6. make an array of 50 integers
		int[] intList = new int[50];
		//this makes every integer in the array a random number from 0-99
		for(int i = 0; i<intList.length; i++) {
			intList[i] = new Random().nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = intList[0];	
		for(int i = 0; i<intList.length; i++) {
			if(intList[i]<smallestNumber) {
				smallestNumber = intList[i];
			}
		}
		System.out.println("Smallest number: " + smallestNumber );
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i<intList.length; i++) {
			System.out.println(intList[i]);
		}
		//10. print the largest number in the array.
		int largestNumber = intList[0];	
		for(int i = 0; i<intList.length; i++) {
			if(intList[i]>largestNumber) {
				largestNumber = intList[i];
			}
		}
		System.out.println("Largest number: " + largestNumber);

	}
}
