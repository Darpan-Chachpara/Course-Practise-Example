#include<stdio.h>
#include<string.h>
main()
{
	char str[1000];
	int i,words=0;
	printf("\n ENTER THE STRING : \n\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]==' ')
		{
			words++;
		}
	}
	printf("\n\n THE NUMBER OF WORDS ARE : %d\n\n",words+1);
}
