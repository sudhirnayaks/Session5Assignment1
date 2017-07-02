package session5;

public class Triangle extends Figure{
	double side1, side2, side3;//sides
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	

	//Method to find the area of triangle
	public void findArea() {
		double s = (side1 + side2 +side3)/2;
		System.out.println("The area of Triangle with sides "+side1+","+side2+","+side3+"is -->" +Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)));
		
	}

	//Method to find the perimeter of triangle
	public void findPerimeter() {
		System.out.println("The perimeter of Triangle with sides "+side1+","+side2+","+side3+"is -->"+ (side1+side2+side3));
		
	}

}
