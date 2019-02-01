/* Cooter Gale
date: 2-1-19

RegularPolygon
_________________
n int
side double
x double
y double
_________________
regularPolygon()
regularPolygon(n, side)
regularPolygon(n, side, x, y)
accessor and mutator methods for all of them
getPerimeter()
getArea()

*/

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon(){
		this.n = 3;
		this.side = 1;
		this.x = 0;
		this.y = 0;
	}
	
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	public int getN(){
		return this.n;
	}
	public double getSide(){
		return this.side;
	}
	public double getX(){
		return this.x;
	}
	public double getY(){
		return this.y;
	}
	public void setN(int newN){
		this.n = newN;
	}
	public void setSide(double newSide){
		this.side = newSide;
	}
	public void setX(double newX){
		this.x = newX;
	}
	public void setY(double newY){
		this.y = newY;
	}
	public double getPerimeter(){
		return this.n * this.side;
	}
	public double getArea(){
		double area = (this.n * this.side * this.side)/(4 * Math.tan(Math.PI / this.n));
		return area;
	}
}