#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],b[1000];
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	strcpy(b,a);
	strrev(b);
	if(strcmp(a,b)==0)
	{
		printf("\n THE STRING IS A PALINDROME : %s",a,b);
	}
	else
	{
		printf("\n THE STRING IS A NOT PALINDROME : %s",a,b);		
	}
}
