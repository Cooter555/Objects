//Cooter Gale
//01-23-19

/*
Rectangle
------------
+width: double
+length: double
________________
+Rectangle()
+Rectangle(length: double, width: double)
+getArea(): double
+getPerimeter(): double
_______________________
*/

class Rectangle {
	
	double width = 1;
	double length = 1;
	
	public Rectangle() {
	width = 1;
	length = 1;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	double getArea() {
		return width * length;
	}
	
	double getPerimeter() {
		return (2 * width) + (2 * length);
	}
}