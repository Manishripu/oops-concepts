package polymorphism;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the base method with specific logic
    @Override
    public void calculateArea() {
        double area = width * height;
        System.out.println("Rectangle Area: " + area);
    }
}