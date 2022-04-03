
import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double km,ucret;

       System.out.println("Gidilen kilometreyi yazınız : ");
       km = input.nextFloat();
       ucret = (km*2.20)+10.0;

       if (ucret <= 20){
           System.out.println("Orjinal Tutar = " + ucret + "TL");
           System.out.println("Ödenecek Tutar = " + 20.0 + "TL");
        }else{
           System.out.println("Ödenecek ücret = " + ucret + "TL");
       }


    }
}
