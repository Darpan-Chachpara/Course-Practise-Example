#include<stdio.h>
int IsPerfect(int num);
int Perfect(int num1,int num2);
main()
{
	int num1,num2;
	printf("\n ENTER THE FIRST NUMBER \n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE SECOND NUMBER \n\n");
	scanf("%d",&num2);
	
	printf("\n ALL PERFECT NUMBERS BETWEEN %d to %d are : \n",num1,num2);
	Perfect(num1,num2);
}

	int IsPerfect(int num)
	{
		int i,sum;
		sum=0;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		return 1;
		else
		return 0;
	}
	
	
	int Perfect(int num1,int num2)
	{
	while(num1<=num2)
	{
		if(IsPerfect(num1))
		{
			printf("\n%d \n\n",num1);
		}
		num1++;
	}
	}
	
