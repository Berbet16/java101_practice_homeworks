
import java.util.Scanner;

public class daire_hesaplama {
    public static void main(String[] args) {
        float r,a;

        Scanner input = new Scanner(System.in);

        System.out.println("Yarı Çapı giriniz");
        r = input.nextFloat();

        System.out.println("Açıyı giriniz");
        a = input.nextFloat();

        double cevre = 2*r* Math.PI ;
        double alan = Math.PI * r*r;
        double tarali_alan = ((alan*a)/360);

        System.out.println("Çevre = " + cevre + " Alan = " + alan + " Taralı Alan = " + tarali_alan);

    }
}
