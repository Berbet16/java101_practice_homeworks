
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        int km, age, direction;
        double totalPrice, kmPrice = 0.10;

        Scanner scan = new Scanner(System.in);
        System.out.print("Lüften kaç km yolculuk yapcağınızı giriniz :");
        km = scan.nextInt();

        if (km < 0) 
        {
            System.out.println("Hatalı giriş!!");
            return;
        }
        System.out.print("Lüften yaşınızı giriniz :");
        age = scan.nextInt();

        if (age < 0)
        {
            System.out.println("Hatalı giriş!!");
            return;
        }

        System.out.print("Lüften yolculuk tipini giriniz :");
        System.out.println("\n1-Tek yön \n2-Gidiş-dönüş");
        direction = scan.nextInt();

        if (direction == 1) 
        {
            if (0 < age && age <= 12) 
            {
                totalPrice = ((kmPrice * km) * 0.5);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
            if (age > 12 && age < 24) 
            {
                totalPrice = ((kmPrice * km) * 0.1);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
            if (age > 65) 
            {
                totalPrice = ((kmPrice * km) * 0.35);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
        } 
        else if (direction == 2) 
        {
            if (age <= 12) 
            {
                totalPrice = (((kmPrice * km) * 0.5) * 2);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
            if (age > 12 && age < 24) 
            {
                totalPrice = (((kmPrice * km) * 0.1) * 2);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
            if (age > 65) 
            {
                totalPrice = (((kmPrice * km) * 0.35) * 2);
                System.out.println("Bilet tutarı :" + totalPrice + " TL");
            }
        } 
        else 
        {
            System.out.println("Hatalı giriş!!");
        }
    }
}
