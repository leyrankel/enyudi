import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(num + "!: " + factorial(num));
    }
    public static int factorial(int num) {
        if(num > 0) {
            return num * factorial(num-1);
        }
        else{
            return 1;   
        }
    }
}            
