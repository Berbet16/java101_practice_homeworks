package Maths;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        double armut= scan.nextDouble()*2.14;

        System.out.println("Elma Kaç Kilo ? :");
        double elma= scan.nextDouble()*3.67 ;

        System.out.println("Domates Kaç Kilo ? :");
        double domates= scan.nextDouble()*1.11;

        System.out.println("Muz Kaç Kilo ? :");
        double muz= scan.nextDouble()*0.95;

        System.out.println("Patlıcan Kaç Kilo ?");
        double patlican= scan.nextDouble()*5.00;

        double toplam=armut+elma+domates+muz+patlican;


        System.out.println("Toplam Tutar :"+toplam);

    }
}
