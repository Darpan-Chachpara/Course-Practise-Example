#include<stdio.h>
main()
{
	long long num;
	int count=0;
	printf("\n ENTER THE NUMBER\n\n");
	scanf("%lld",&num);
	while(num!=0)
	{
		num=num/10;   //2563/10=256 and count++ will give the number
		count++;
	}
	printf("NUMBER OF DIGIT :%d",count);
}

