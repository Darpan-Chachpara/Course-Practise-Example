#include<stdio.h>
main()
{
	int Costprice,Sellingprice,Amount;
	printf("\nENTER COST PRICE\n\n");
	scanf("%d",&Costprice);
	printf("\nENTER SELLING PRICE\n\n");
	scanf("%d",&Sellingprice);
	
	if(Sellingprice>Costprice)
	{
		Amount=Sellingprice-Costprice;
		printf("\n PROFIT");
	}
	else if(Costprice>Sellingprice)
	{
		Amount=Costprice-Sellingprice;
		printf("\n LOSS");
	}
	else
	{
		printf("\n NO POFIT NO LOSS");
	}
}
