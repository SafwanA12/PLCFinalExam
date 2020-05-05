//Safwan Alam PLC Final Question 6 Part 2  
import java.util.Scanner;
public class PLCFinalQ6P2 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        int min;
        int mid;
        int max;

        Scanner scan = new Scanner(System.in);

        System.out.println("Input Three Integers: ");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a > b && a > c && b > c){
            min = c;
            mid = b;
            max = a;
        }
        else if(a > b && a > c && b < c){
            min = b;
            mid = c;
            max = a;
        }
        else if(b > c && b > a && c > a){
            min = a;
            mid = c;
            max = b;
        }
        else if(b > a && b > a && c < a){
            min = c;
            mid = a;
            max = b;
        }
        else if(c > a && c > b && a > b){
            min = b;
            mid = a;
            max = c;
        }
        else{
            min = a;
            mid = b;
            max = c;
        }
        System.out.println("min: " + min);
        System.out.println("mid: " + mid);
        System.out.println("max: " + max);
        scan.close();
    }
}