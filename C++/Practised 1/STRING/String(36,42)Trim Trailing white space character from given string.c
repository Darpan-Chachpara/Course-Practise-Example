#include<stdio.h>
main()
{
	char a[100];
	int i;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	for(i=0;a[i]==' ';i++);
	{
		for(i--;a[i]=='\0';i--);
		{
		
		if(a[i]!=strlen(a)-1)     // if false the come out of the loop
		{
			a[i+1]='\0';
			printf("\n THE STRING AFTER THE TRAILING OPERATION : %s",a);
		}
	}
}
}
