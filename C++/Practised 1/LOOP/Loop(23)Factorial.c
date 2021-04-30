#include<stdio.h>
main()
{
	int i,num,fact=1;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	printf("FACTORIAL OF THE NUMBER IS %d",fact,num);
}
