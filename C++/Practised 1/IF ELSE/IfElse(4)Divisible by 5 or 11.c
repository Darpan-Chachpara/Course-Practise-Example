#include<stdio.h>
main()
{
	int num;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	if((num % 5 == 0) && (num % 11 == 0))
	{
		printf("%d THE NUMBER IS DIVISIBLE BY 5 AND 11",num);
	}
	else
	{
		printf("%d THE NUMBER IS NOT DIVISIBLE BY 5 AND 11",num);
	}
}
