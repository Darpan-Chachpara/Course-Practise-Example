#include<stdio.h>
main()
{
	int num1,*x,a;
	float  num2,*y,b;
	char num3,*z,c;
	
	printf("\n ENTER THE INTEGER VALUE : \n\n");
	scanf("%d",&num1);
	printf("\n ENTER THE FLOAT VALUE : \n\n");
	scanf("%f",&num2);
	printf("\n ENTER THE CHARACTER VALUE : \n\n\n");
	scanf("%c",&num3);
	scanf("%c",&num3);
	printf("\n RESULTS\n\n");

		
	printf("\n THE VALUE OF num1 = %d",num1);
	printf("\n THE VALUE OF num2 = %.3f",num2);
	printf("\n THE VALUE OF num3 = %c",num3);
	printf("\n\n");

	
	x=&num1;
	y=&num2;
	z=&num3;
	printf("\n THE ORIGINAL ADDRESS IN x = %u AND VALUE = %d",x,*x);
	printf("\n THE ORIGINAL ADDRESS IN y = %u AND VALUE = %.3f",y,*y);
	printf("\n THE ORIGINAL ADDRESS IN z = %u AND VALUE = %c",z,*z);
	printf("\n\n");
	
	x++;
	y++;
	z++;
	printf("\n NEW ADDRESS IN x = %u",x);
	printf("\n NEW ADDRESS IN y = %u",y);
	printf("\n NEW ADDRESS IN z = %u",z);
	printf("\n\n");


	a=*x;
	b=*y;
	c=*z;
	printf("\n %d",a);
	printf("\n %.3f",b);
	printf("\n xxxx %c",c);
	printf("\n\n");

}
