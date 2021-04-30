#include<stdio.h>
#include<string.h>
main()
{
	char a1[1000],a2[1000];
	printf("\n ENTER THE FIRST STRING : \n\n");
	gets(a1);
	printf("\n ENTER THE SECOND STRING : \n\n");
	gets(a2);
	strcat(a1,a2);
	printf("\n STRING AFTER CONCATENATION IS : %s \n\n",a1,a2);
}
