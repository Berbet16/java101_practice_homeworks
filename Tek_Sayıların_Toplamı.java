package Odev;

import java.util.Scanner;

public class PatikaOdev 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	
		int k, total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen sayı giriniz:");
		
		boolean teksayi = false;
		while(teksayi == false)
		{
			k = scan.nextInt();
			
			if( k % 2 == 0 && k % 4 == 0)
			{
				total += k;
			}
			else
			{
				teksayi = true;
				System.out.println("Sistem tamamlandı");
			}
		}
		System.out.println(total);
		}
}
