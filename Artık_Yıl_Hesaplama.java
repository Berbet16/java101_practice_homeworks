import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        int year;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Lüften yıl giriniz :");
        year = scan.nextInt();

        if (year % 4 == 0) 
        {
            if (year % 100 == 0 && year % 400 != 0) 
            {
                System.out.println(year + " bir artık yıl değildir.");
            } 
            else 
            {
                System.out.println(year + " artık bir yıldır.");
            }

        } 
        else 
        {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
