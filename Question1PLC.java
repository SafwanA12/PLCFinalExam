//Safwan Alam PLC Final Question 1
import java.util.*;

public class Question1PLC {
    private static String type;

    public static void main(final String[] args) {
        System.out.println(
                " This program will identify string literal, variable name, floating point literal, and interger literal, Just type in your value");
        final Scanner scan = new Scanner(System.in);
        final String input = scan.nextLine();
        scan.close();

        if (String(input)) {
            type = "String Literal";
        }

        else if (Variable(input)) {
            type = "Variable Name";
        }

        else if (Float(input)) {
            type = "Floating Point";
        }

        else if (Integer(input)) {
            type = "Integer Literal";
        }

        else {
            type = "Sorry can't check for that one!";
        }

        System.out.println("The input,  " + input + " is a " + type);

    }


    //program then refers to these methods which use regex to check if the input falls into the checks parameters
    private static boolean String(final String input) {
        final String stringCheck = "^\"{1}[^\"]*\"{1}$";
        if (input.matches(stringCheck))
            return true;
        else
            return false;
    }

    private static boolean Integer(final String input) {
        final String intCheck = "^[-+]?[0-9]+$";
        if (input.matches(intCheck))
            return true;
        else
            return false;
    }

    private static boolean Variable(final String input) {
        final String idCheck = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
        if (input.matches(idCheck))
            return true;
        else
            return false;
    }

    private static boolean Float(final String input) {
        final String floatCheck = "^[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?f$";
        if (input.matches(floatCheck))
            return true;
        else
            return false;
    }

}