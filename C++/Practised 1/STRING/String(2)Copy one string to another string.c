#include<stdio.h>
#include<string.h>
main()
{
	char source[1000],destination[1000];
	printf("\n INPUT STRING : \n\n");
	gets(source);
	strcpy(destination,source);
	printf("\n SOURCE STRING : %s\n",source);
	printf("\n DESTINATION STRING : %s\n",destination);

}
