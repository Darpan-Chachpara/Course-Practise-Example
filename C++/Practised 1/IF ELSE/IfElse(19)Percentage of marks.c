#include<stdio.h>
main()
{
	float average,phy,chem,bio,math,comp;
	printf("\nENTER THE MARKS OF FIRST SUBJECT\n\n");
	scanf("%f" ,&phy);
	printf("\nENTER THE MARKS OF SECOND SUBJECT\n\n");
	scanf("%f" ,&chem);
	printf("\nENTER THE MARKS OF THIRD SUBJECT\n\n");
	scanf("%f" ,&bio);
	printf("\nENTER THE MARKS OF FOURTH SUBJECT\n\n");
	scanf("%f" ,&math);
	printf("\nENTER THE MARKS OF FIFTH SUBJECT\n\n");
	scanf("%f" ,&comp);
	
	average=(phy+chem+bio+math+comp)/5;
	printf("\nPERCENTAGE=%.2f",average);
	
	if(average>=90)
	{
		printf("\nGrade is A");
	}
	else if(average>=80)
	{
		printf("\nGrade is B");
	}
	else if(average>=70)
	{
		printf("\nGrade is C");
	}
	else if(average>=60)
	{
		printf("\nGrade is D");
	}
	else if(average>=40)
	{
		printf("\nGrade is E");
	}
	else if(average<40)
	{
		printf("\nGrade is F");
	}
	else
	{
		printf("\nFAIL");
	}
}

