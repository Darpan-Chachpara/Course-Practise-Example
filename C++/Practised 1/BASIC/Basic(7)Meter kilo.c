#include<stdio.h>
main()
{
	double Centimeter,Meter,Kilometer;
	
	printf("\nENTER THE CENTIMETER\n");
	scanf("%lf",&Centimeter);
	
	Meter=Centimeter/100.0;
	Kilometer=Centimeter/100000.0;
	
	printf("\nLength in Meter\n%.2lfm",Meter);
	printf("\nLength in Kilometer\n%.2lfkm",Kilometer);
	
}
