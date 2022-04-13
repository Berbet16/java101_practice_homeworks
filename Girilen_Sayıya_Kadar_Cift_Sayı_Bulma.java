package Odev;

import java.util.Scanner;

public class PatikaOdev 
{
	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		
	Scanner a =new Scanner(System.in);
		
        int toplam=0;
        
        int ort =0;
        
        System.out.print("sayı giriniz:");
        int sayi = a.nextInt();
        
        
        System.out.print("3 ve 4 e bölünebilen sayılar:");
        
        for(int i=1 ; i <= sayi ; i++)
        {
            if(i % 4 == 0 && i % 3 == 0) 
            {
                ort += i-(i-1);
                System.out.print(i+" ");
            }
        }
	}

}
