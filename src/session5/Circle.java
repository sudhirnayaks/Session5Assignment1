package session5;

public class Circle extends Figure{
	double radius; //radius
	final double pi = Math.PI; //pi value
	
	Circle(double radius){
		this.radius = radius;
	}
	
	
	//Method to find the area of circle
	public void findArea() {
		System.out.println("Area of circe with radius "+radius+"-->"+ (pi*radius*radius));
		
		
	}

	//Method to find the perimeter of circle
	public void findPerimeter() {
		System.out.println("Perimeter of the the circle with radius "+radius+"-->"+(2*pi*radius));
		
	}

}
