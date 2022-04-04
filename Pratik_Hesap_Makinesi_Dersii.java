import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a, b, select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Select an operator number: ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + Math.abs(a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                System.out.println("Division: " + (a / b));
                break;
            default:
                System.out.println("a valid number!");
        }
    }
}
