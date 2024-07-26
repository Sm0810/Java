import java.util.Scanner;

class Rectangle{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the  length of the rectangle: ");
        double length = scanner.nextDouble();


        System.out.println("Enter the width of the recangle: ");
        double width = scanner.nextDouble();

        
        scanner.close();

        
        double area = length * width;

        
        System.out.println("The area of the recangle is: " + area);
    }
}