#include<stdio.h>
main()
{
	char ch;
	printf("\nENTER THE CHARACTER\n\n");
	scanf("%c",&ch);
	
	if(((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')))
	{
		printf("\n%c CHARACTER IS ALPHABET",ch);
	}
	else
	{
		printf("\n%c NOT A ALPHABET",ch);
	}
}
