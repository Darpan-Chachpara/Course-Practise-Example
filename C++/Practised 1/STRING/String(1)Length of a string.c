#include<stdio.h>
#include<string.h>
main()
{
	char d[1000];
	int i;
	printf("\n ENTER ANY STRING : \n\n");
	gets(d);
	for(i=0;d[i]!='\0';i++); // in string (;)is used along with s[i]!=0
	{
		printf("\n LENGTH OF STRING = %d",i);
	}
}
