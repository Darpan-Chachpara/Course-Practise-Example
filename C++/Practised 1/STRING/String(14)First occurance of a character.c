#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],ch;
	int i,count=0;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	printf("\n ENTER THE CHARACTER YOU WANT TO SEARCH : \n\n");
	scanf("%c",&ch);
	
	for(i=0;a[i]!='\0';i++)
	{
		if(a[i]==ch)
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		printf("\n THE FIRST OCCURRENCE OF THE SEARCH ELEMENTS '%c' IS IN POSITION %d",ch,i);
	}
	else
	{
		printf("\n THERE IS NO SUCH ELEMENTS IN THE STRING '%c'",ch);
	}
}
