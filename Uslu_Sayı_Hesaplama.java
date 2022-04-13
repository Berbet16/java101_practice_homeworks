package Odev;

import java.util.Scanner;

public class PatikaOdev 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

        int a,b,toplam=1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü giriniz : ");
        a = scan.nextInt();
        
        System.out.print("Üssü alınacak sayıyı Giriniz : ");
        b = scan.nextInt();

        for(int i = 1 ; i <= a ; i++)
        {
            toplam *= b;
        }
        System.out.print(toplam);
	}
}
