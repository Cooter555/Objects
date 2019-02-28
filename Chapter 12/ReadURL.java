//Cooter Gale
//feb 25 2019

import java.util.Scanner;

class ReadURL {
	public static void main(String[] args) {
		System.out.println("Enter the url from the assignment description: ");
		String URLString = new Scanner(System.in).next();
		
		try{
			java.net.URL url = new java.net.URL(URLString);
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.next();
				count++;
			}
			System.out.println("The file size is " + count + " words");
			}
			
			
			catch (java.net.MalformedURLException ex) {
				System.out.println("Invald URL");
			}
			catch (java.io.IOException ex) {
				System.out.println("I/O Errors: no such file");
			}
		}
	}
