#include<stdio.h>
int Num(int num);

main()
{
	int num;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	Num(num);
}

int Num(int num)
{
	if(num%2==0)
	{
		printf("\n %d IS AN EVEN NUMBER\n",num);
	}
	else
	{
		printf("\n %d IS AN ODD NUMBER\n",num);
	}
}

