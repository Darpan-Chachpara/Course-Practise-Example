#include<stdio.h>
int fun(char str[]);
main()
{
	char str[50];
	printf("\n ENTER THE STRING : \n\n");
	gets(str);
	fun(str);
}

int fun(char str[])
{
	printf("\n STRING OUTPUT \n\n%s\n",str);
}
