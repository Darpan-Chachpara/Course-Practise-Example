#include<stdio.h>
main()
{
	struct 
	{
		char name[50];
		float price;
		int page;
	} book;
	
	printf("\n ENTER THE NAME OF THE BOOK : \n\n");
	scanf("%s",&book.name);
	printf("\n ENTER THE PRICE OF THE BOOK : \n\n");
	scanf("%f",&book.price);	
	printf("\n ENTER THE PAGE OF THE BOOK : \n\n");
	scanf("%d",&book.page);

	printf("\n\n THE RESULTS IS : \n\n");
	printf("\n%s \n%0.3f \n%d",book.name,book.price,book.page);
}
