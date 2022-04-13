package Odev;

import java.util.Scanner;

public class PatikaOdev 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Faktoriyel Sayısı: ");
	     int n = scan.nextInt();
	     int total = 1;
	     
	     for(int i = 1; i <= n; i++)
	     {
	    	 total *= i;
	     }
	     System.out.println(n + " sayısının Faktöriyel Sayısının açılımı:" + total);
	}
}
