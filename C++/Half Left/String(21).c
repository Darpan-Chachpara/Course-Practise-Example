#include<stdio.h>
#include<string.h>
main()
{
	char a[1000],ch;
	int i=0;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	printf("\n ENTER THE CHARACTER THAT YOU WANT TO REMOVE : \n\n");
	scanf("%d",&ch);
	
	for(i=0;a[i]!=0 && ch!=a[i];i++)
	{
		for(i<a[i])
		{
		a[i]=a[i+1];
			i++;
		}
	}
						printf("\n THE FINAL STRING AFTER REMOVING FIRST OCCURANCE OF %c = %s",ch,a);
	}
