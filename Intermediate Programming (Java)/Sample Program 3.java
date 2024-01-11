import java.util.Scanner;
public class SampleProgram3 {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kel.nextInt();
        int[] array = new int[size];
        int sum = 0;
        for(int i = 0; i<array.length; i++) {
            array [i] = (int) (Math.random() * 10 + 1);
            sum += array[i];
        }
        System.out.print("Array elements: ");
        for(int i=0; i<array.length - 1; i++) {
            System.out.print(array[i] + " + ");
        }
        System.out.print(array[array.length-1] + " = " + sum);
    }
}
