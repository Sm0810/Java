import java.util.Scanner;

 class Cylinder{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

       
        scanner.close();

        
        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("The surface area of the cylinder is: " + surfaceArea);
    }
}