#include<stdio.h>
main()
{
	int i=1,num,sum=0;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	/*for(i=1;i<=(num-1);i++);
	{
		if(num%i==0)
		{
			sum=sum+i;
			}	
	}*/
	while(i<num)
	{
		if(num%i==0)
		sum=sum+i;
		i++;
	}
	if(sum==num)
	
	printf("THE USER INPUT %d IS A PERFECT NUMBER",i);
	
	else
	
	printf("THE USER INPUT %d IS A NOT A PERFECT NUMBER",i);
	

		
}
