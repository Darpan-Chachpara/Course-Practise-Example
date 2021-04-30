#include<stdio.h>
main()
{
	int num1,num2;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%d",&num1);
	printf("\nENTER THE SECOND NUMBER\n\n");
	scanf("%d",&num2);
	
	switch(num1>num2)
	{
		case 0 :
			printf("\n THE GREATER NUMBER IS %d\n",num2);
			break;
		case 1 :
			printf("\n THE GREATER NUMBER IS %d\n",num1);
			break;
		default :
			printf("\n BOTH NUMBER ARE SAME \n");
			break;
	}
}
