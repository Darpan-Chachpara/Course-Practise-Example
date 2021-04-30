#include <stdio.h>
int main()

{
	long long int num,rem,i,count=0;
    printf("\nENTER THE NUMBER: \n\n");
    scanf("%lld",&num);
	printf("\n ENTER THE DIGIT: \n\n");
	scanf("%lld",&rem);
    while(num!=0)
    {
       i=num%10;
		if(i==rem)
{
	count++;
}
	num=num/10;
}
		printf("\n The count of digit %lld is %lld times ",rem,count);

}
