package Main.Day0811;

public class Circle {
    public static void main(String[] args) {
        new PassObject().printAreas(new Circle(), 5);
    }
    double radius;
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
