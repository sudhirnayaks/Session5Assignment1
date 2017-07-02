package session5;

public class TestFigure  {
    public static void main(String args[]){
    	//Rectangle Test
    	double width = 5, length = 7;
        Figure rectangle = new Rectangle(length, width);
        rectangle.findArea();
        rectangle.findPerimeter();
        System.out.println("*********************************************************************************");
        //Triangle Test
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        Figure triangle = new Triangle(side1,side2,side3);
        triangle.findArea();
        triangle.findPerimeter();
        System.out.println("*********************************************************************************"); 
        //Circle Test
        double radius = 5;
        Figure circle = new Circle(radius);
        circle.findArea();
        circle.findPerimeter();
        System.out.println("*********************************************************************************");

    }
}
