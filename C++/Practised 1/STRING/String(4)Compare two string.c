#include<stdio.h>
#include<string.h>
main()
{
	char a1[1000],a2[1000];
	printf("\n ENTER THE FIRST STRING : \n\n");
	gets(a1);
	printf("\n ENTER THE SECOND STRING : \n\n");
	gets(a2);
	if(strcmp(a1,a2)==0)
	{
		printf("\n THE STRINFGS ARE EQUAL : \n\n%s\n\n%s\n",a1,a2);
	}
	else
	{
		printf("\n THE STRINFGS ARE NOT EQUAL : \n\n%s\n\n%s\n",a1,a2);		
	}
}
