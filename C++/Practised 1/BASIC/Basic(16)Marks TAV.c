#include<stdio.h>
main()
{
	float sub1,sub2,sub3,sub4,sub5,total,average,percentage;
	printf("\nENTER THE MARKS OF FIRST SUBJECT\n\n");
	scanf("%f",&sub1);
	printf("\nENTER THE MARKS OF SECOND SUBJECT\n\n");
	scanf("%f",&sub2);
	printf("\nENTER THE MARKS OF THIRD SUBJECT\n\n");
	scanf("%f",&sub3);
	printf("\nENTER THE MARKS OF FOURTH SUBJECT\n\n");
	scanf("%f",&sub4);
	printf("\nENTER THE MARKS OF FIFTH SUBJECT\n\n");
	scanf("%f",&sub5);
		
	total=sub1+sub2+sub3+sub4+sub5;
	average=total/5;
	percentage=(total/500)*100;
	
	printf("\nTotal Marks is :>  %.2f \nTotal Average is :>  %.2f \nTotal Percentage is :>  %.2f",total,average,percentage);
	
}
