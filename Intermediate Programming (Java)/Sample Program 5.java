import java.util.Scanner;
public class SampleProgram5 {
    public static void main(String[] args) {
        output(input());
    }
    public static int[] input() {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kel.nextInt();
        int[] array = new int[size];
        for(int i=0; i<array.length; i++) {
            array [i] = (int) (Math.random() * 10 + 1);
        }
        return array;
    }
    public static void output(int[] array) {
        System.out.print("Array elements: ");
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
