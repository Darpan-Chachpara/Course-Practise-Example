#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],ch;
	int i;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	printf("\n ENTER THE CHARACTER YOU WANT TO SEARCH : \n\n");
	scanf("%c",&ch);
	
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==ch)
		{
			printf("\n '%c' IS AT POSITION %d",ch,i+1);
		}
	}
}
