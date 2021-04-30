#include<stdio.h>
main()
{
	char a[100];
	int i,j;
	printf("\n ENTER THE STRING : \n\n");
	gets(a);
	for(i=0;a[i]==' ';i++);
	{
		if(a[i]!=0)     // if false the come out of the loop
		{
			for(j=0;a[j]=a[j+i];j++);
			{
				for(i--;a[i]==' ';i--)
			{
				a[i+1]='\0';
			}
				printf("\n THE STRING AFTER LEADING AND TRAILING OPERATION : %s",a);

			}
		}
	}
}
