#include <stdio.h>
int fact(int num);
int StrongNumbers(int num1, int num2);


int main()
{
    int num1,num2;
    printf("\n ENTER THE FIRST NUMBER : \n\n");
    scanf("%d", &num1);
    printf("\n ENTER THE SECOND NUMBER : \n\n");
    scanf("%d", &num2);
    
    printf("\nALL STRONG NUMBERS BETWEEN %d TO %d ARE: \n", num1, num2);
    StrongNumbers(num1, num2);
}



int StrongNumbers(int num1, int num2)
{
    int num,sum;
    while(num1 != num2)
    {
        sum = 0;
        num = num1;
        
        while(num != 0)
        {
            sum =sum+ fact(num % 10);
            num =num/10; 
        }
        
        if(num1 == sum)
        {
            printf("\n %d \n", num1);
        }
        
        num1++;
    }
}



int fact(int num)
{
    if(num == 0)
        return 1;
    else
        return (num * fact(num-1));
}



