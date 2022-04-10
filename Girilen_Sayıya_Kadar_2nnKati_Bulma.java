package Odev;

import java.util.Scanner;

public class PatikaOdev 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int k;
	   Scanner inp = new Scanner(System.in);
	   System.out.print("Bir sayi Giriniz : ");
	   k = inp.nextInt();
	        
	   for(int i = 1; i <= k ; i++)
	   {
	       if(i % 4 == 0 && i % 5 == 0) 
	       {
	           System.out.println(i + " sayisi 4 ve 5 in katıdır");
	       }
	   }
	}
}
