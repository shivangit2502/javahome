public class Circle extends MathConstants {

    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }

    // ❌ Uncommenting this will cause an error because displayPI() is final
    /*
    @Override
    public void displayPI() {
        System.out.println("Trying to override final method");
    }
    */

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.displayPI(); // inherited from MathConstants
        circle.calculateArea(5.0);

        // ❌ Uncommenting this will cause an error because PI is final
        // circle.PI = 3.14;
    }
}
