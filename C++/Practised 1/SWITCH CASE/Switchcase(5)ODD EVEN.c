#include<stdio.h>
main()
{
	int num;
	printf("\nENER THE NUMBER\n\n");
	scanf("%d",&num);
	
	switch(num % 2)
	{
		case 0:
			printf("\nNUMBER IS EVEN");
			break;
		case 1:
			printf("\nNUMBER IS ODD");
			break;
	}
}
