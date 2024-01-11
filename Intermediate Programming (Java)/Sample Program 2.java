import java.util.Scanner;
public class SampleProgram2 {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        int[] array = new int[5];
        // input
        for(int i=0; i<array.length; i++) {
            System.out.print("Enter element: ");
            array[i] = kel.nextInt();
        }
        //output 
        System.out.print("Array elements: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
