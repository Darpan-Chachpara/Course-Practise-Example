#include<stdio.h>
main()
{
	int num,*j,**k;
	j=&num;
	k=&j;
	
	printf("\n ENTER THE NUMBER : \n\n");
	scanf("%d",&num);
	
	printf("\n THE ADDRESS OF num = %u",&num);
	printf("\n THE ADDRESS OF num = %u",j);
	printf("\n THE ADDRESS OF num = %u",*k);
	printf("\n\n GREAT JOB\n\n");
	
	printf("\n THE ADDRESS OF j = %u",&j);
	printf("\n THE ADDRESS OF j = %u",k);
	printf("\n THE ADDRESS OF k = %u",&k);
	printf("\n\n GREAT JOB\n\n");
	
	printf("\n THE VALUE OF num = %d",num);
	printf("\n THE VALUE OF num = %d",*j);
	printf("\n THE VALUE OF num = %d",**k);
	printf("\n\n GREAT JOB\n\n");

}
