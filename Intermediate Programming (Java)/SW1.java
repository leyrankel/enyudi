import java.util.Scanner;
import java.util.Arrays;
public class SW1 {
    public static void main(String[] args) {
        Scanner kel = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = kel.nextInt();
        double[] myList = new double[size];
        for(int i = 0; i< myList.length; i++) {
            System.out.print("Enter element: ");
            myList[i] = kel.nextDouble();
        }
        System.out.print("Find: ");
        double find = kel.nextDouble();
        int index = 0;
        for(int i = 0; i< myList.length; i++) {
            if(myList[i] == find) {
                index = i;
            }
        }
        System.out.println(find+" is at index "+index);
    }

}
