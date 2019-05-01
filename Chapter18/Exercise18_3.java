import java.util.*;

class Exercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int m = input.nextInt();
		System.out.println("Enter the second integer: ");
		int n = input.nextInt();
		System.out.println("gcd is: " + gcd(m, n));
		
	}
	public static int gcd(int n, int m) {
		if (m % n == 0) {
			return n;
		}
		else {
			return gcd(n, m % n);
		}
		
	}
}