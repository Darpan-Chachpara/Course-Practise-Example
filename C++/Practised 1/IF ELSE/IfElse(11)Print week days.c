#include<stdio.h>
main()
{
	int num;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	if(num==1)
	{
		printf("\nMONDAY");
	}
	else if(num==2)
	{
		printf("\nTUESDAY");
	}
	else if(num==3)
	{
		printf("\nWEDNESDAY");
	}
	else if(num==4)
	{
		printf("\nTHRUSDAY");
	}
	else if(num==5)
	{
		printf("\nFRIDAY");
	}
	else if(num==6)
	{
		printf("\nSATURDAY");
	}
	else if(num==7)
	{
		printf("\nSUNDAY");
	}
	else
	{
		printf("\nINVALID INPUT");
	}

}
