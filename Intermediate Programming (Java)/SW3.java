import java.util.*;

public class SW3 {
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

        int evenNum = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenNum++;
            }
        }

        System.out.println("\nThere are " + evenNum + " even numbers in the array.");
    }
}
