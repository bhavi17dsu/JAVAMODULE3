public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.print();
        Rectangle r2 = new Rectangle(10, 20);
        r2.print();
    }
}
class Rectangle {
    private int length;
    private int breadth;
    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void print() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }
}
