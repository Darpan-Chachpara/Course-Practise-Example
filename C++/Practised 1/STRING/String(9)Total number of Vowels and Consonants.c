#include<stdio.h>
#include<string.h>
main()
{
	char str[1000];
	int i,vowels=0,consonants=0;
	printf("\n ENTER THE STRING : \n\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
		{
		if(str[i]=='a' || str[i]=='e' || str[i]=='i' || str[i]=='o'|| str[i]=='u' 
		|| str[i]=='A' || str[i]=='E' || str[i]=='I'|| str[i]=='O' || str[i]=='U')
		{
			vowels++;
		}
		else
		{
			consonants++;
		}
		}
	}
	printf("\n NUMBER OF VOWELS ARE : %d\n",vowels);
	printf("\n NUMBER OF CONSONANTS ARE : %d\n",consonants);
}
