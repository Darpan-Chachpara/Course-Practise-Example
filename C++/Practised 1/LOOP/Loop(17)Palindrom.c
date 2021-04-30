#include<stdio.h>
main()
{
	int temp,rev=0,n;
	printf("\nENTER THE VAUE\n\n");
	scanf("%d",&n);
	temp=n;
	while(n!=0)
	{
	
		rev=(rev*10)+(n%10);
		n=n/10;
	}
	if(rev==temp)
	{
		printf("\n%d is Palindrom.",temp);
	}
	else
	{
		printf("\n%d is not Palindrom",temp);
	}	
}
