package RECTANGLE;

class Main {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(69.0, 420.0);
        rect.printRectInfo();
    }
}

interface Shape {
    double getArea();
    double getPerimeter();
    void printRectInfo();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void printRectInfo() {
        System.out.printf("%-10s: %.2f\n", "Width", width);
        System.out.printf("%-10s: %.2f\n", "Height", height);
        System.out.printf("%-10s: %.2f\n", "Area", getArea());
        System.out.printf("%-10s: %.2f\n", "Perimeter", getPerimeter());
    }
}
