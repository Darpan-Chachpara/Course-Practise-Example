#include<stdio.h>
main()
{
	char ch;
	printf("\nENTER ANY CHARACTER\n\n");
	scanf("%c",&ch);
	
	if(ch>='A' && ch<='Z')
	{
		printf("\n%c is UpperCase Character",ch);
	}
	else if(ch>='a' && ch<='z')
	{
		printf("\n%c is LowerCase Character",ch);
	}
	else
	{
		printf("\n%c is not an Alphabet",ch);
	}
}
