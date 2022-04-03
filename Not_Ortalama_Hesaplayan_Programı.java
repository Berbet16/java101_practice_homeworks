
package Maths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float math,phy,chem,tur,his,mus;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter The Math Result: ");
        math = input.nextFloat();

        System.out.println("Enter The Physics Result: ");
        phy = input.nextFloat();

        System.out.println("Enter The Chemistry Result: ");
        chem = input.nextFloat();

        System.out.println("Enter The Turkish Result: ");
        tur = input.nextFloat();

        System.out.println("Enter The History Result: ");
        his = input.nextFloat();

        System.out.println("Enter The Music Result: ");
        mus = input.nextFloat();

        double sums = math+phy+chem+tur+his+mus;
        double avg = sums / 6.0;

        boolean result = avg > 60;
        System.out.println("Avegare Point is : " + avg);
        System.out.println("You " + (result ? "Pass" : "Fail"));




    }
}
