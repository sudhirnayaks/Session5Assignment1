package session5;

public class Rectangle extends Figure {
	double length, width; //sides
	
	public Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	//Method to caluclate the area of rectangle.
	public void findArea() {
		// Area = length * width
		System.out.println("Length is "+length+" and width is "+width+"  --> The area of Rectangle is "+ (length*width));
		
	}

	//Method to Calculate the perimeter of rectangle.
	public void findPerimeter() {
		//P= 2 *(Length + width)
		System.out.println("Length is "+length+" and width is "+width+"  --> The Perimeter of Rectangle is " +(2*(length+width)));
		
	}
	

}
