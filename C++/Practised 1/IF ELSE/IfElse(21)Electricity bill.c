#include <stdio.h>

int main()
{
    int num;
    float amount,totalamount,surcharge;
    printf("\n ENTER THE NUMBER: \n\n");
    scanf("%d",&num);

    if(num<=50)
    {
        amount=num*0.50;
    }
    else if(num<=150)
    {
        amount=25+((num-50)*0.75);
    }
    else if(num<=250)
    {
        amount=100+((num-150)*1.20);
    }
    else
    {
        amount=220+((num-250)*1.50);
    }
 	surcharge=amount*0.20;
    totalamount=amount+surcharge;

    printf("\nELECTRICITY BILL = RS %.2f",totalamount);
}
