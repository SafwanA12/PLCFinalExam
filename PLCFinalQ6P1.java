//Safwan Alam PLC Final Question 6 002248637
import java.util.Scanner;
public class PLCFinalQ6P1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int min = 0;
        int mid = 0;
        int max = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type your 3 values (integer) ");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        // this version of the code will utilize nested statements to find the solution
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    min = c;
                    mid = b;
                    max = a;
                } else {
                    min = b;
                    mid = c;
                    max = a;
                }
            } else {
                min = b;
                mid = a;
                max = c;
            }
        } else {
            if (b < c) {
                min = a;
                mid = b;
                max = c;
            } else {
                if (a < c) {
                    min = a;
                    mid = c;
                    max = b;
                } else {
                    min = c;
                    mid = a;
                    max = b;
                }
            }
        }
        System.out.println("min:" + min);
        System.out.println("med:" + mid);
        System.out.println("max:" + max);
        scan.close();
    }
}