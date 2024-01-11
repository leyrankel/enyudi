import java.util.Scanner;
public class ArrayAndRecursion {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        int[] array = new int[5];
        for(int i=0; i<array.length; i++) {
            System.out.print("Enter Element: ");
            array[i] = kel.nextInt();
        }
        //output
        System.out.print("Array Elements: ");
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + ""); 
        }
    }
}

// Array and Recursion
public class Lectures {
    public static void main(String[] args) {
        final int NUMBER_OF_ELEMENTS = 100;
        double[] numbers = new double[NUMBER_OF_ELEMENTS];
        double sum = 0;

        java.util.Scanner input = new java.util.Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / NUMBER_OF_ELEMENTS;

        int count = 0; // The number of elements above average
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++)
        if (numbers[i] > average)
        count++;
        
        System.out.println("Average is " + average);
        System.out.println("Number of elemnts above the average " + count);
    }
}
