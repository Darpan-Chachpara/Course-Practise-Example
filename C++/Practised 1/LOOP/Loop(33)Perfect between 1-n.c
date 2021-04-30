#include<stdio.h>
main()
{
	int num,i,sum,j;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
	sum=0;
	for(j=1;j<i;j++)
	{
		if(i%j==0)
		{
			sum=sum+j;
		}
		}
		if(sum==i)	
		{
			printf("\n THE PERFECT NUMBER IN GIVEN INTERVAL IS %d",i);
		}
		/*else
		{
			printf("\n THERE IS NO PERFECT NUMBER IN THE GIVEN INTERVAL %d",i);
		}*/
	}		

}
