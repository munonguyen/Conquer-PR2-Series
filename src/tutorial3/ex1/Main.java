package tutorial3.ex1;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle(2.0,"blue");
        System.out.println("Radius c1: " + c1.getRadius());
        System.out.println("Color c1: "+ c1.getColor());
        System.out.println("Area c1: " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("Radius c2: "+c2.getRadius());
        System.out.println("Color c2: "+ c2.getColor());
        System.out.println("Area c2: " + c2.getArea());

        Circle c3 = new Circle();
        System.out.println("Radius c3: " +c3.getRadius());
        System.out.println("Color c3: "+c3.getColor());
        System.out.println("Area c3: "+c3.getArea());
    }
}
