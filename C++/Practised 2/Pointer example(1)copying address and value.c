#include<stdio.h>
main()
{
	int num;
	
	printf("\n ENTER THE INPUT NUMBER : \n\n");
	scanf("%d",&num);
	
	int *b;		//pointer declaration	//b is integer pointer
	b=&num;		//pointer iniotilization
	
	printf("\n THE ADDRESS OF num= %u",&num);		//indirection,dereferencing
	printf("\n THE VALUE OF num = %d",num);			//value at the address
	printf("\n THE VALUE OF b POINTING to num = %d",*b);		//b is pointing a there for in 
	printf("\n THE VALUE OF b = %d",b);		//output the value remians same only
	printf("\n THE ADDRESS OF POINTER b = %u",&b);		//address is changed

}
