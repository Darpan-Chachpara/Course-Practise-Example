#include<stdio.h>
main()
{
	int num;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	if(num%2==0)
	{
		printf("%d THE NUMBER IS EVEN",num);
	}
	else
	{
		printf("%d THE NUMBER IS ODD",num);
	}
}
