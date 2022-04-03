
import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İşlem seçin : alan veya hipotenus");
        String islem = input.nextLine();

        if (islem.equals("alan")){
            System.out.println("Alan yazıldı");

            float a,b,c;

            System.out.println("a Uzunluğunu Giriniz : ");
            a = input.nextFloat();

            System.out.println("b Uzunluğunu Giriniz : ");
            b = input.nextFloat();

            System.out.println("c Uzunluğunu Giriniz : ");
            c = input.nextFloat();

            double u = ((a+b+c)/2.0);
            double cevre = (2*u);
            double alan  = Math.sqrt(u * (u - a)* (u - b) * (u - c));

            System.out.println("Çevre = " + cevre + " Alan = " + alan);

        }else if (islem.equals("hipotenus")){

            System.out.println("Hipotenus Yazıldı");

            float a,b;

            System.out.println("a Uzunluğunu Giriniz : ");
            a = input.nextFloat();

            System.out.println("b Uzunluğunu Giriniz : ");
            b = input.nextFloat();

            double c = Math.sqrt((a*a)+(b*b));

            System.out.println("Hipotenüs = " + c);

        }else {
            System.out.println("Yanlış İşlem");
        }
    }
}
