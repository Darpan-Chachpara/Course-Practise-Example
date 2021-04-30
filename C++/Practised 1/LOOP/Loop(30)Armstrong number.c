#include<stdio.h>
main()
{
	int num,remainder,result=0,OrNum;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	OrNum=num;
	while(OrNum!=0)
	{
		remainder=OrNum%10;
		result=result+(remainder*remainder*remainder);
		OrNum=OrNum/10;
	}	
	if(result==num)
	{
	printf("%d IS AN ARMSTRONG NUMBER",num);
	}
	else
	{
	printf("%d IS NOT AN ARMSTRONG NUMBER",num);
	}
}
