import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        System.out.print("Enter radius: ");
        c.setRadius(sc.nextDouble());
        System.out.print("Enter height: ");
        c.setHeight(sc.nextDouble());
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Surface Area: " + c.getSurfaceArea());
        System.out.println("Volume: " + c.getVolume());
        sc.close();
    }
}
class Cylinder {
    private double radius;
    private double height;
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}
