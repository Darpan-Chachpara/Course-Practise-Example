#include<stdio.h>
int Prime(int num1,int num2);
int isPrime(int num);

main()
{
	int num1,num2;
	printf("\n ENTER THE FIRST NUMBER\n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE FIRST NUMBER\n\n");
	scanf("%d",&num2);
	
	Prime(num1,num2);
}

int Prime(int num1,int num2)
{
	printf("\n ALL PRIME NUMBER %d to %d are :\n\n",num1,num2);
	while(num1<num2)
	{
		if(isPrime(num1))
		{
			printf("%d\n\n",num1);
		}
		num1++;
	}
}

int isPrime(int num)
{
	int i;
	for(i=2;i<=num/2;i++)
	{
		if(num%i==0)
		{
			return 0;
		}
	}
	return 1;
}







