//Cooter Gale
//2-14-19

import java.util.ArrayList;
import java.util.Scanner;

class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		System.out.println("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) {
			int place = input.nextInt();
			duplicates.add(place);
		}
		
		removeDuplicate(duplicates);
		
		System.out.println("List without duplicates: ");
		
		for (int i = 0; i < duplicates.size(); i++) {
			System.out.print(duplicates.get(i) + " ");
		}
	}
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++) {
			if (!temp.contains(list.get(i))) {
				temp.add(list.get(i));
			}
		}
		list.clear();
		for(int i = 0; i < temp.size(); i++) {
			list.add(temp.get(i));
		}
	}
}
		
