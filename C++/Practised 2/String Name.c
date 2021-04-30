#include<stdio.h>
main()
{
	char name[30];
	printf("\n ENTER NAME : \n\n");
	gets(name);    // read string
//	scanf("\t%s",&name); scanf is not used in STRING
	printf("\n YOUR NAME IS : ");
	puts(name);  // display string
}
