#include<stdio.h>
#include<string.h>

struct Employee
{
	int id;
	char name[50];
}emp; //declaring emp variable for structure
main()
{
	
	// store first employee information
	emp.id=9999;
	strcpy(emp.name,"DARPAN"); //copying string inta char array
	
	// printing first employee information
	printf("\n Employee 1 id : %d\n",emp.id);
	printf("\n Employee 1 name : %s\n",emp.name);
}

