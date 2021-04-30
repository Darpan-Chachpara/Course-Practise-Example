#include<stdio.h>
int Factorial(int i);
main()
{
	int i;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&i);
	
	int Factorial(int i);
	printf("\n FACTORIAL OF %d IS %d\n",i,Factorial(i));
}

	int Factorial(int i)
{
	if(i<=1)
	{
		return 1;
	}
	return i*Factorial(i-1);
}
