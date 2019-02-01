class main {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4, 40);
		
		System.out.println("The lenght of rect is: " + rect.length);
		System.out.println("The width of rect is: " + rect.width);
		System.out.println("The area of rect is: " + rect.getArea());
		System.out.println("The perimeter of rect is: " + rect.getPerimeter());
		System.out.println();
		
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The lenght of rect2 is: " + rect2.length);
		System.out.println("The width of rect2 is: " + rect2.width);
		System.out.println("The area of rect2 is: " + rect2.getArea());
		System.out.println("The perimeter of rect2 is: " + rect2.getPerimeter());
		
	}
}