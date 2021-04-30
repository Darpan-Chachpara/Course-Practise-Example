#include<stdio.h>
int Armstrong(int num);
int IsArmstrong(int num1,int num2);

main()
{
	int num1,num2;
	printf("\n ENTER THE FIRST NUMBER \n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE SECOND NUMBER \n\n");
	scanf("%d",&num2);
	
	printf("\n ALL ARMSTRONG NUMBER BETWEN %d TO %d ARE :  \n\n",num1,num2);
	IsArmstrong(num1,num2);
}


	int Armstrong(int num)
	{
		int temp,fact,sum;
		temp=num;
		sum=0;
		while(temp!=0)
		{
			fact=temp%10;
			sum=sum+(fact*fact*fact);
			temp=temp/10;
		}
		if(num==sum)
		return 1;
		else
		return 0;
	}


	int IsArmstrong(int num1,int num2)
	{
		while(num1<=num2)
		{
			if(Armstrong(num1))
			{
				printf("%d \n\n",num1);
			}
			num1++;
		}
		
	}





