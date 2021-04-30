#include<stdio.h>
main()
{
	struct employee
	{
		int empNo;
		char empName[20];
		float empSalary;
	};
	
	int i,num;
	printf("\n ENTER THE NUMBER OF EMPLOYEE : \n\n");
	scanf("%d",&num);
	struct employee emp[num];
	for(i=0;i<num;i++)
	{
	printf("\n ENTER EMPLOYEE CONTACT NUMBER : \n\n");
	scanf("%d",&emp[i].empNo);
	printf("\n ENTER EMPLOYEE NAME : \n\n");
	scanf("%s",&emp[i].empName);
	printf("\n ENTER EMPLOYEE SALARY : \n\n");
	scanf("%f",&emp[i].empSalary);
	}
	for(i=0;i<num;i++)
	{
		printf("\n EmpNumber = %d \tEmpName = %s \t\tEmpSalary = %.3f \n\n",
		emp[i].empNo,emp[i].empName,emp[i].empSalary);
	}
}
