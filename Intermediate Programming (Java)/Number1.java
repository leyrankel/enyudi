import java.util.Scanner;
public class Number1 {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double rad = kel.nextDouble();
        radiusOrcircumference(rad);
    }
    public static void radiusOrcircumference(double rad) {
        double ans;
        ans = 2*Math.PI*rad;

        System.out.println("Circumference: " + ans);
    }
}
