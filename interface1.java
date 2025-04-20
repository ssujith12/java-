// Interface Shape
interface Shape {
	void area();
	void perimeter();
}

// Circle class implements Shape
class Circle implements Shape {
	double radius;

	Circle(double r) {
	   radius = r;
	}
	public void area() {
	   double a = Math.PI * radius * radius;
	   System.out.println("Area of Circle: " + a);
	}
	public void perimeter() {
	     double p = 2 * Math.PI * radius;
	     System.out.println("Perimeter of Circle: " + p);
	}
}

// Rectangle class implements Shape
class Rectangle implements Shape {
     double length, breadth;
     
     Rectangle(double l, double b) {
	    length = l;
	    breadth = b;
     }

     public void area() {
	    double a = length * breadth;
	    System.out.println("Area of Rectangle: " + a);
     }

     public void perimeter() {
	    double p = 2 * (length + breadth);
	    System.out.println("Perimeter of Rectangle: " + p);
     }
}

// Main class
public class Main {
     public static void main(String[] args) {
	    Shape circle = new Circle(5);
	    circle.area();
	    circle.perimeter();
	    
	    Shape rectangle = new Rectangle(4, 6);
	    rectangle.area();
	    rectangle.perimeter();
     }
}
