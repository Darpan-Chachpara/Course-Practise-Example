#include<stdio.h>
main()
{
	int num;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&num);
	
	switch(num>0)
	{
		case 1:
			printf("\n NUMBER IS POSITIVE");
			break;
		case 0:
			switch(num<0)
			{
				case 1:
					printf("\n NUMBER IS NEGATIVE");
					break;
				case 0:
					printf("\n NUMBER IS ZERO");
			}
	}
	
}
