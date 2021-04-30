#include<stdio.h>
main()
{
	int i,j,num,fact;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		fact=0;
		for(j=1;j<=num;j++)
		{
			if(i%j==0)
			fact++;
		}
		if(fact==2)
		printf("\n PRIME NUMBER ARE %d",i);
	}
	
}
