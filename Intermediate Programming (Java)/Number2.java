import java.util.Random;
import java.util.Scanner;

public class Number2 {
    public static void main(String[] args) {
        Scanner kel = new Scanner (System.in);
        System.out.println("Enter number of characters: ");
        int num = kel.nextInt();
        Random r =new Random();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i <num; i++) {
            int rindex = r.nextInt(26)+'a';
            sb.append((char)rindex);
        }
        String rstring = sb.toString();
        System.out.print("Randomly Generated String: " + rstring);
    }
}
