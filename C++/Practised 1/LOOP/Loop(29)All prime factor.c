#include<stdio.h>
main()
{
	int num,i;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			printf("\n THE FACTOR ARE %d",i);
		}
	}	
}
