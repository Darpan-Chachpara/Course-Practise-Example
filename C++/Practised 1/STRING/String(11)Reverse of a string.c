#include<stdio.h>
#include<string.h>
main()
{
	char s[1000];
	printf("\n ENTER THE STRING : \n\n");
	gets(s);
	
	strrev(s);
	printf("\n\n REVERSE OF THE STRING : %s\n\n",s);
}
