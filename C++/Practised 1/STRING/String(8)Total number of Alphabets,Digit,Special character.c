#include<stdio.h>
#include<string.h>
main()
{
	char str[1000];
	int digits=0,others=0,alphabets=0,i;
	printf("\n ENTER THE STRINGS : \n\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if((str[i]>='a' && str[i]<='z') || (str[i]>='A' && str[i]<='Z'))
		{
			alphabets++;
		}
		else if(str[i]>='0' && str[i]<='9')
		{
			digits++;
		}
		else
		{
			others++;
		}
	}
	printf("\n ALPHABETS = %d\n",alphabets);
	printf("\n DIGITS = %d\n",digits);
	printf("\n SPECIAL CHARACTERS = %d\n",others);
	
}
