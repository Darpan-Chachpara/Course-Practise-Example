#include<stdio.h>
#include<string.h>
main()
{
	char a[1000];
	int i;
	int fre[256]={0}; // the string will be working form 0 to 256
	
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	
	for(i=0;a[i]!='\0';i++)
	{
		fre[a[i]]++;
	}
	
	for(i=0;a[i]!='\0';i++)
	{
		if(fre[a[i]])
		{
			printf("\n FREQUENCY OF '%c' IS '%d' \n",a[i],fre[a[i]]);	
			fre[a[i]]=0;
		}
	}
}

