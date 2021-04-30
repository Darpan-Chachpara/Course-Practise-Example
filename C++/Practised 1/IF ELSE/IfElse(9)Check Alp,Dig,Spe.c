#include<stdio.h>
main()
{
	char ch;
	printf("\nENTER THE CHARACTER\n\n");
	scanf("%c",&ch);
	
	if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	{
		printf("\n%c is the Alphabet",ch);
	}
	else if(ch>='0' && ch<='9')
	{
		printf("\n%c is the Digit",ch);
	}
	else
	{
		printf("\n%c is special Character",ch);
	}
}
