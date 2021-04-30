#include<stdio.h>
main()
{
	char a[100];
	int i,j;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	for(i=0;a[i]==' ';i++);
	for(j=0;a[i]!='\0';i++)
	{
		if(a[i]==' ' && a[i-1]==' ')
		continue;
			a[j++]=a[i];
		}
	if(a[j-1]==' ')
	{
		a[j-1]='\0';
	}
	else
	{
		a[j]='\0';
	}
	printf("\n AFTER REMOVING EXTRA SPACE THE FOLLOWING STRING IS : %s",a);
}
