//Author: Cooter Gale
//Date: 2/19/19


import java.util.*;
class Exercise_12_3 {
	public static void main(String[] args) {
		int[] test = new int[100];
		for (int i = 0; i < 100; i++){
			test[i] = (int)(Math.random() * 10000);
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Type in an index in the array, 0-99");
		int index = input.nextInt();
		try {
			System.out.println("you have chosen " + index + " The value at this position is " + test[index]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Choose a number in the boundaries you idiot.");
		}
	}
}