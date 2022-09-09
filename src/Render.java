import java.util.Scanner;

public class Render {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the width: ");
        double width = sc.nextDouble();
        System.out.printf("Enter the height: ");
        double height = sc.nextDouble();

        Retangle retangle = new Retangle(width, height);

        System.out.println("Your Rectangle  \n " + retangle.display());
        System.out.println("Perimeter of the Rectangle: " + retangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + retangle.getArea());
    }
}
