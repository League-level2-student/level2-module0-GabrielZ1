package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] stringList = {"hello", "my", "name", "is", "gabriel"};
		//2. print the third element in the array
		System.out.println(stringList[2]);
		//3. set the third element to a different value
		stringList[2] = "NAME";
		//4. print the third element again
		System.out.println(stringList[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i<stringList.length; i++) {
			System.out.println(stringList[i]);
		}
		//6. make an array of 50 integers
		int[] intList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
		//7. use a for loop to make every value of the integer array a random number

		//this makes every integer in the array a random number from 0-99
		for(int i = 0; i<intList.length; i++) {
			intList[i] = new Random().nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println("Smallest number: " + );
		//9 print the entire array to see if step 8 was correct
		for(int i = 0; i<intList.length; i++) {
			System.out.println(intList[i]);
		}
		//10. print the largest number in the array.
		System.out.println("Largest number: " + );

	}
}
