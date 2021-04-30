#include<stdio.h>
main()
{
	int rem,num,sum,i,j,fact,temp;
	printf("\n ENTER THE NUMBER FROM 1 TO : \n\n");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
{	
	temp=i;
	sum=0;
	while(temp>0)
	{
		rem=temp%10;
		fact=1;
		for(j=rem;j>=1;j--)
		{
			fact=fact*j;
		}
		sum=sum+fact;
		temp=temp/10;
	}
	if(sum==i)
	printf("\nSTRONGER NUMBER ARE %d\n",i);
}
}
