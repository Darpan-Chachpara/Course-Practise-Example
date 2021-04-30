package Assignment;

import java.util.Scanner;

public class IfElse__13__CountNumberOfNotes 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int amount,note2000,note1000,note500,note200,note100;
		int note50,note20,note10,note5,note2,note1;
		note2000=note1000=note500=note200=note100=0;
		note50=note20=note10=note5=note2=note1=0;
		System.out.println("ENTER THE AMOUNT : ");
		amount=sc.nextInt();
		
		if(amount>=2000)
		{
			note2000=amount/2000;
			amount=amount-(note2000*2000);
		}
		if(amount>=1000)
		{
			note1000=amount/1000;
			amount=amount-(note1000*1000);
		}
		if(amount>=500)
		{
			note500=amount/500;
			amount=amount-(note500*500);
		}
		if(amount>=200)
		{
			note200=amount/200;
			amount=amount-(note200*200);
		}
		if(amount>=100)
		{
			note100=amount/100;
			amount=amount-(note100*100);
		}
		if(amount>=50)
		{
			note50=amount/50;
			amount=amount-(note50*50);
		}
		if(amount>=20)
		{
			note20=amount/20;
			amount=amount-(note20*20);
		}
		if(amount>=10)
		{
			note10=amount/10;
			amount=amount-(note10*10);
		}
		if(amount>=5)
		{
			note5=amount/5;
			amount=amount-(note5*5);
		}
		if(amount>=2)
		{
			note2=amount/2;
			amount=amount-(note2*2);
		}
		if(amount>=1)
		{
			note1=amount;
		}
		System.out.println("2000 RS NOTE : "+note2000);
		System.out.println("1000 RS NOTE : "+note1000);
		System.out.println("500 RS NOTE : "+note500);
		System.out.println("200 RS NOTE : "+note200);
		System.out.println("100 RS NOTE : "+note100);
		System.out.println("50 RS NOTE : "+note50);
		System.out.println("20 RS NOTE : "+note20);
		System.out.println("10 RS NOTE : "+note10);
		System.out.println("5 RS NOTE : "+note5);
		System.out.println("2 RS NOTE : "+note2);
		System.out.println("1 RS NOTE : "+note1);
		sc.close();
	}
}
