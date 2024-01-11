import java.util.*;

public class SW2 {
    public static void main(String[] args) {
        int[] array = input();
        output(array);
    }

    public static int[] input() {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kel.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        kel.close();
        return array;
    }

    public static void output(int[] array) {
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        
        Arrays.sort(array); 
        
        System.out.print("\nSorted Array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
