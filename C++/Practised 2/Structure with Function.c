#include<stdio.h>

struct s
{
	char ch;
	int i;
	float a;
	};
	main()
	{
		struct s var={'D',100,10.10};
		
	fun(var);
	gun(&var);
	}
	gun(struct s *var)
	{
		printf("\n \t%c \t%d \t%.3f",var ->ch,var ->i,var ->a);
		return;
	}
	fun(struct s var)
	{
		printf("\n \t%c \t%d \t%.2f",var.ch,var.i,var.a);
		return;
	}

