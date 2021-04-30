#include<stdio.h>
int Armstrong(int num);
int Perfect(int num);
int Prime(int num);
main()
{
	int num;
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	
	if( Armstrong(num))
	{
		printf("\n THE %d IS AN ARMSTRONG NUMBER\n\n",num);
	}
	else
	{
		printf("\n THE %d IS NOT AN ARMSTRONG NUMBER\n\n",num);
	}
	
	if(Perfect(num))
	{
		printf("\n THE %d IS A PERFECT NUMBER\n\n",num);
	}
	else
	{
		printf("\n THE %d IS NOT A PERFECT NUMBER\n\n",num);
	}

	if(Prime(num))
	{
		printf("\n THE %d IS A PRIME NUMBER\n\n",num);
	}
	else
	{
		printf("\n THE %d IS NOT A PRIME NUMBER\n\n",num);
	}
}

	int(Armstrong(int num))
	{
		int sum=0,rec,fact;
		rec=num;
		while(num!=0)
		{
			fact=num%10;
			sum=sum+(fact*fact*fact);
			num=num/10;
		}
		return(rec==sum);
	}

	int(Perfect(int num))
	{
		int i,sum=0,rec;
		rec=num;
		for(i=1;i<num;i++);
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return(rec==sum);
	}
	
	int(Prime(int num))
	{
		int i,rec;
		rec=num;
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return(rec==i);
			}
		}
	}
