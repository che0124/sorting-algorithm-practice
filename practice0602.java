import java.util.Scanner;

class Shape {
    public static double calculateArea() {
        return 0; 
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
    	this.radius = radius;
    }

    public static double calculateArea() {
        double area = this.radius*this.radius;
        return area;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static double calculateArea() {
        double area = this.length*this.width;
        return area;		
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public static double calculateArea() {
        double area = (this.base*this.height)/2; 	
        return area;
    }
}

public class practice0602 {
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("intput r : ");
        double r = sc.nextDouble();
        System.out.println("intput l, w : ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        System.out.println("intput b, h : ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        Circle a = new Circle(r);
        Rectangle b = new Rectangle(l, w);
        Triangle c = new Triangle(b, h);
        System.out.println("Circle area: " + a.calculateArea());
        System.out.println("Rectangle area: " + b.calculateArea()); 	
        System.out.println("Triangle area: " + c.calculateArea());	
    }
}

