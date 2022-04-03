
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("KDV'siz Fiyat: ");
        float kdvsiz = scan.nextFloat();
        
        double kdv_dahil;
        
        if(kdvsiz >0 && kdvsiz <= 1000)
        {
        	kdv_dahil =(kdvsiz*1.18);
        }
        else
        {
        	kdv_dahil = (kdvsiz*1.08);
        }
        
        System.out.println("ÜrününKDV Fiyatı:" + kdv_dahil);
    }
}
