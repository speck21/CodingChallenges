import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Enter width of triangle: ");
        x = scan.nextDouble();
        System.out.println("Enter height of triangle: ");
        y = scan.nextDouble();

        System.out.println("The triangle's area is: " + triArea(x, y) + " units.");
    }

    public static double triArea(double width, double height){
        return .5*width*height;
    }
}