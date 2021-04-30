#include<stdio.h>
main()
{
	char op;
	int num1,num2;
	printf("\n ENTER CHOICE\n\n");
	scanf("%c",&op);
	printf("\n ENTER THE FIRST NUMBER\n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE SECOND NUMBER\n\n");
	scanf("%d",&num2);
	
	switch(op)
	{
		case '+':
			//result=num1+num2;
			printf("\n THE ADDITION OF :  %d + %d =  %d",num1,num2,num1+num2);
			break;
		case '-':
			//result=num1-num2;
			printf("\n THE SUBTRACTION OF :  %d - %d =  %d",num1,num2,num1-num2);
			break;
		case '*':
			//result=num1*num2;
			printf("\n THE MULTLIPLICATION OF :  %d * %d =  %d",num1,num2,num1*num2);
			break;
		case '/':
			//result=num1/num2;
			printf("\n THE DIVISION OF %d / %d :  =  %d",num1,num2,num1/num2);
			break;
		default :
			printf("INVALID OPERATOR\n\n%d");
	}
	
}
