package Odev;
import java.util.Scanner;

public class PatikaOdev 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a,toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz");
        a=inp.nextInt();

        while (a > 0)
        {
            System.out.println(a % 10);
            toplam=( a % 10 ) + toplam;
            a = a / 10;
        }
        System.out.print(toplam);
	}
}
