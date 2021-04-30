#include<stdio.h>
main()
{
	double A;
	
	printf("\nENTER THE NUMBER\n\n");
	scanf("%lf",&A);
	
	if(A>0)
	{
	printf("\n%.2lf THE NUMBER IS POSITIVE",A);
	}
	else  if(A<0)
	{
	printf("%.2lf THE NUMBER IS NEGATIVE",A);
	}
	else if(A==0)
	{
	printf("%.2lf THE NUMBER IS ZERO",A);
	}
}
