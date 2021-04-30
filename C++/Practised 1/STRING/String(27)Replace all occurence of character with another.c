#include<stdio.h>
#include<string.h>
main()
{
	char a[100],ch,newch;
	int i;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	printf("\n ENTER THE CHARACTER YOU WANT TO REPLACE : \n\n");
	scanf("%c",&ch);
	getchar();
	printf("\n ENTER THE NEW CHARACTER FOR REPLACE : \n\n");
	scanf("%c",&newch);
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==ch)				//to find the match
		{
			a[i]=newch;				// replace with the match
		}
	}
	printf("\n THE FINAL STRING AFTER REPLACING ALL OCCURANCE %c WITH %c IS = \n\t\t\t\t\t\t\t     '%s'",ch,newch,a);
}
