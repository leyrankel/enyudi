import java.util.Scanner;
public class SampleProgram4 {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kel.nextInt();
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array [i] = (int) (Math.random() * 10 + 1);
        }
        System.out.print("Array elements: ");
        for(int element: array) {
            System.out.print(element + " ");
        }
        int max = array[0];
        int min = array[0];
        for(int i=0; i<array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > min) {
                min = array[i];
            }
        }
        System.out.println("\nMaximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
