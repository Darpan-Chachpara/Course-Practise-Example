#include<stdio.h>
#include<string.h>
main()
{
	char str[1000];
	int i;
	printf("\n ENTER THE STRING : \n\n");
	gets(str);
	for(i=0;str[i]!='\0';i++)
	{
		if(str[i]>='a' && str[i]<='z')
		{
			str[i]=str[i]-32;
		}
	}
	printf("\n THE STRING IN UPPER CASE IS ALSO BELOW : \n\n%s\n\n",str);
	
}
