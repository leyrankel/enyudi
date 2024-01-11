import java.util.*;
public class Week1 {
    public static void main(String[] args){
        Scanner kel = new Scanner(System.in);

        System.out.print("Enter the value of radius: ");
        double radius = kel.nextDouble();

        double areaOfCirlce = (radius * radius) * Math.PI;
        System.out.println("The area of circle is using Math.pow " + areaOfCirlce);
        System.out.printf("Formatting result in two decimal places: " + "%.2f", areaOfCirlce);
        System.out.println();

        areaOfCirlce = Math.pow(radius,2) * Math.PI;
        System.out.println("The are of circle is using Math.pow" + areaOfCirlce + "\n");

        int num = (int) (Math.random() * 10);
        int num1 = (int) (Math.random() * 100);
        double b = (double) (Math.random() * 10);
        char c = (char) ('A'+ Math.random() * ('Z' - 'A' + 1));
        System.out.println("The random number is: " + num);
        System.out.println("The random number is: " + num1);
        System.out.printf("The random number is: " + "%.2f", b);
        System.out.println("\nThe random character is: " + c);
    }
}
