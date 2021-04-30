#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],result;
	int i,max=-1;
	int fre[256]={0}; // the dtring will be working form 0 to 256
	
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	
	for(i=0;a[i]!='\0';i++)
	{
		fre[a[i]]++;
	}
	
	for(i=0;a[i]!='\0';i++)
	{
		if(max<fre[a[i]])
		{
			max=fre[a[i]];
			result=a[i]; // if not occuring then the first elements will be in the output
		}
	}
	printf("\n THE MAXIMUM OCCURING CHARACTER IN A GIVEN STRING : \n\n\t\t\t'%c'\n",result);	
}

