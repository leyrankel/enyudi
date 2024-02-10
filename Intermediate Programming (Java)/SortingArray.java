package SampleCodes;
import java.util.*;
public class SortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            System.out.print("Enter element: ");
            array[i] = input.nextInt();
        }
        System.out.print("Array elements: ");
        for (int element: array){
            System.out.print(element + " ");
        }
        int temp;
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
               if(array[j] > array[i]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;               
               }
            }
        }
        System.out.print("\nSorted Array: ");
        for(int element: array){
            System.out.print(element + " ");
        }
    }
}
