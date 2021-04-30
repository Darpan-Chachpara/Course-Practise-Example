package Assignment;

import java.util.Scanner;

public class IfElse__21__ElectricityUnitChargeCalculateTotalElectricityBill
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE UNIT CHARGE : ");
		double num=sc.nextDouble();
		double amount,Surcharge,Totalamount;
		if(num<=50)
		{
			 amount=num*0.50;
		}
		else if(num<=150)
		{
			amount=25+((num-50)*0.75);
		}
		else if(num<=250)
		{
			amount=100+((num-150)*1.20);
		}
		else
		{
			amount=220+((num-250)*1.50);
		}
		Surcharge=amount*0.20;
		Totalamount=amount+Surcharge;
		System.out.println("YOUR ELECTRICITY BILL AMOUNT IS  "+Totalamount+" Rs");
		sc.close();
	}
}
