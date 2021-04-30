#include<stdio.h>
main()
{
	int num1,num2,num3;
	printf("\nENTER THE TWO NUMER\n\n");
	scanf("%d%d",&num1,&num2);
	printf("\BEFORE SWAPPING THE NUMBER ARE \n%d \n%d",num1,num2);
	num3=num1;
	num1=num2;
	num2=num3;
	printf("\nAFTER THE SWAPPING THE NUMBER ARE \n%d \n%d",num1,num2);
	
}
