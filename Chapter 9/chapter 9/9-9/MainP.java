class MainP {
	public static void main(String[] args) {
		RegularPolygon regularPolygon = new RegularPolygon();
		RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
		RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Perimeter of regularPolygon " + regularPolygon.getPerimeter());
		System.out.println("Perimeter of regularPolygon2 " + regularPolygon2.getPerimeter());
		System.out.println("Perimeter of regularPolygon3 " + regularPolygon3.getPerimeter());
		System.out.println("Area of regularPolygon " + regularPolygon.getArea());
		System.out.println("Area of regularPolygon2 " + regularPolygon2.getArea());
		System.out.println("Area of regularPolygon3 " + regularPolygon3.getArea());
		
	}
}