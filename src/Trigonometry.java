import java.util.Scanner;
import static java.lang.Math.pow;


public class Trigonometry {
    public static void main(String[] args) {
        Scanner tim = new Scanner(System.in);
        //For the calculation of area of circle
        System.out.println("For the calculation of area of circle");
        System.out.print("Enter the radius: ");
        double r = tim.nextDouble();
        double cirArea = calculateCircleArea(r);
        System.out.println("The area of the circle= " + cirArea + " sq.m");

        //For the calculation of area of rectangle
        System.out.println("For the calculation of area of rectangle");
        System.out.print("Enter the length of the rectangle: ");
        double l = tim.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double b = tim.nextDouble();
        double rectArea = calculateRectArea(l,b);
        System.out.println("The area of the rectangle= " + rectArea + " sq.m");

        //For the calculation of area of triangle
        System.out.println("For the calculation of area of Triangle");
        System.out.print("Enter the height of the triangle: ");
        double h = tim.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double b2 = tim.nextDouble();
        double triArea = calculateTriangleArea(h,b2);
        System.out.println("The area of the triangle= " + triArea + " sq.m");

    }

    public static double calculateCircleArea(double r) {
        return  3.14*pow(r,2);
    }

    public static double calculateRectArea(double length, double breadth) {
        return  length*breadth;
    }

    public static double calculateTriangleArea(double height, double base) {
        return  (height*base)/2;
    }
}
