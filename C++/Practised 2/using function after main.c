#include<stdio.h>
void msg();    //prototype

main()
{
	printf("\n BEFORE\n\n");
	msg();
	printf("\n AFTER\n\n");
}
void msg()
{
	printf("\n HI HELLO\n\n");
}
