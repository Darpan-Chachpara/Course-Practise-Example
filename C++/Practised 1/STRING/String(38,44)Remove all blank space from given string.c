#include<stdio.h>
main()
{
	char a1[100];
	int i,count=0;
	printf("\n ENTER THE STRING : \n\n");
	gets(a1);
	for(i=0;a1[i]!='\0';i++)
	{
		if(a1[i]!=' ')
		{
			a1[count]=a1[i];
			count++;
		}
	}
	a1[count]='\0';
	printf("\n AFTER REMOVING EXTRA SPACE THE FOLLOWING STRING IS : %s",a1);
}
