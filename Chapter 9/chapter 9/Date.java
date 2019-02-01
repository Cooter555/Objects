//Cooter Gale
//Jan 24 2019
/*
Date
------------
+.toString(): string
+.getTime(): long
________________
+Date()
+toString(): string
+getTime(): long
+setTime()
_______________________
*/

class Date {
	public static void main(String[] args) {
		java.util.Date date = new java.util.Date();
		
		System.out.println("No change to the time: " + date.toString() + date.getTime());
		
		for (long i = 10000L; i <= 100000000000L; i *= 10){
			date.setTime(i);
			System.out.println("Time set to " + i + "; " + date.toString());
		}
	}
}