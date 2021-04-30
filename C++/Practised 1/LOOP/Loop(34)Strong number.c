#include<stdio.h>
main()
{
	int num,i,r,temp,sum=0,f;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	temp=num;
	while(num)
	{
		i=1,f=1;
		r=num%10;
	while(i<=r)
	{
		f=f*i;
		i++;
	}
	sum=sum+f;
	num=num/10;
	}
	if(sum==temp)
	printf("%d IS A STRONG NUMBER",temp);
	else
	printf("%d IS NOT A STRONG NUMBER",temp);
}
