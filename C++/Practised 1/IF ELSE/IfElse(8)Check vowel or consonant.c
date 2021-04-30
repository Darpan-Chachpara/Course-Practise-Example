#include<stdio.h>
main()
{
	char ch,lowercase,uppercase;
	printf("\nENTER THE CHARACTER\n\n");
	scanf("%c",&ch);
	
	lowercase=(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
	uppercase=(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
	
	if(lowercase||uppercase)
	{
		printf("\n%c is a vowel",ch);
	}
	else
	{
		printf("\n%c is a consonant",ch);
	}
}
