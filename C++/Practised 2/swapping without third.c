#include<stdio.h>
main()
{
	int a,b;
	printf("\nENTER THE TWO NUMBER\n");
	scanf("%d%d",&a,&b);
	printf("\nBEFORE SWAPPING THE NUMBER ARE \n%d \n%d",a,b);
	a=a+b;
	b=a-b;
	a=a-b;
	printf("\nAFTER SWAPPING THE NUMBER ARE \n%d \n%d",a,b);

}
