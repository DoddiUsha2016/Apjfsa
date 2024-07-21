//base class
class Shape {
	double pi=3.14;  //assigning pi value
	
	void display() {
		System.out.println("Shapes defined");
	}
	}
//Circle inherits from Shape
class Circle extends Shape {
	int r=20;
	void print() {
		System.out.println("Circle is created");
		}
	void area() {
		System.out.println("Area of circle:"+(pi*r*r));
		
	}
	void perimeter() {
		System.out.println("Perimeter of Circle:"+(2*pi*r));
	}
	}
class Shape1 {
	public static void main(String[] args) {
		//craeting an object for circle
		Circle c=new Circle();
		c.display();
		c.print();
		c.area();
		c.perimeter();
}
}
