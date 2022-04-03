
import java.util.Scanner;

public class kilo_endeks {
    public kilo_endeks() {
    }

    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen Boyunuzu(metre cinsinden) Giriniz :");
        double boy = input.nextDouble();
        
        System.out.println("Lütfen Kilonuzu Giriniz :");
        double kilo = input.nextDouble();
        
        double endeks = kilo / Math.pow(boy / 100.0D, 2.0D);
        System.out.println("\nEndeksiniz = " + endeks);

    }
}
