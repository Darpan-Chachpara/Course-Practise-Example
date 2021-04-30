#include<stdio.h>
main()
{
	int average;
	printf("ENTER THE AVERAGE\n");
	scanf("%d" ,&average);
	
	if(average>=75)
	{
		printf("Grade is A");
	}
	else if(average>=60)
	{
		printf("Grade is B");
	}
	else if(average>=50)
	{
		printf("Grade is C");
	}
	else if(average>=40)
	{
		printf("Grade is D");
	}
	else 
	{
		printf("Fail");
	}
}

