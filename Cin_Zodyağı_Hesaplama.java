
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        String zodiac = null;
        int birthday;

        Scanner scan = new Scanner(System.in);
        System.out.print("Doğum tarihinizi giriniz :");
        birthday = scan.nextInt();

        if (birthday % 12 == 0) 
        {
            zodiac = "Maymun";
        }
        if (birthday % 12 == 1) 
        {
            zodiac = "Horoz";
        }
        if (birthday % 12 == 2) 
        {
            zodiac = "Köpek";
        }
        if (birthday % 12 == 3) 
        {
            zodiac = "Domuz";
        }
        if (birthday % 12 == 4) 
        {
            zodiac = "Fare";
        }
        if (birthday % 12 == 5) 
        {
            zodiac = "Öküz";
        }
        if (birthday % 12 == 6) 
        {
            zodiac = "Kaplan";
        }
        if (birthday % 12 == 7) 
        {
            zodiac = "Tavşan";
        }
        if (birthday % 12 == 8) 
        {
            zodiac = "Ejderha";
        }
        if (birthday % 12 == 9) 
        {
            zodiac = "Yılan";
        }
        if (birthday % 12 == 10) 
        {
            zodiac = "At";
        }
        if (birthday % 12 == 11) 
        {
            zodiac = "Koyun";
        }
        System.out.println("Zodyağınız :"+zodiac);

    }
}
