import java.util.Scanner;

public class Calculator {
    public static void main (String[] args) {

        char operator;
        Double num1, num2, result;

        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter your First Number : ");
        num1 = newObj.nextDouble();

        System.out.println("Enter Your Second Number : ");
        num2 = newObj.nextDouble();

        System.out.println("Enter Operator : +, -, *, /");
        operator = newObj.next().charAt(0);



    }
}