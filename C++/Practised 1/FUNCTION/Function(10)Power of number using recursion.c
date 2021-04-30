#include<stdio.h>
int power(int base,int exponent);
main()
{
	int base,exponent;
	printf("\n ENTER THE BASE \n\n");
	scanf("%d",&base);
	printf("\n ENTER THE EXPONENET \n\n");
	scanf("%d",&exponent);
	
	power(base,exponent);
	printf("\n\n\t\t %d^%d=%d",base,exponent,power(base,exponent));//\t for tab
	
}

int power(int base,int exponent)
{
	if(exponent==0)
	return 1;
	return (base*power(base,exponent-1));
}
