#include<stdio.h>
main()
{
	double principle,time,rate,SimpleInterest;
	printf("\nENTER THE AMOUNT\n\n");
	scanf("%lf",&principle);
	printf("\nENTER THE TIME\n\n");
	scanf("%lf",&time);
	printf("\nENTER THE RATE\n\n");
	scanf("%lf",&rate);
	
	SimpleInterest=(principle*time*rate)/100;
	printf("\nSIMPLE INTEREST IS:>  %.2lf",SimpleInterest);
}
