import java.util.Scanner;
class Oval{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the length of the major axis: ");
        double majorAxis = scanner.nextDouble();

        
        System.out.println("Enter the length of the minor axis: ");
        double minorAxis = scanner.nextDouble();

        
        scanner.close();

        
        double area = Math.PI * majorAxis * minorAxis;

        
        System.out.println("The area of the oval is: " + area);
    }
}