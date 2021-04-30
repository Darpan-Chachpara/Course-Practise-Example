#include<stdio.h>
main()
{
	int week;
	printf("\nENTER THE NUMBER\n\n");
	scanf("%d",&week);
	
	switch(week)
	{
		case 1:
			printf("\nMONDAY");
			break;
	case 2:
			printf("\nTUESDAY");
			break;
	case 3:
			printf("\nWEDNESDAY");
			break;
	case 4:
			printf("\nTHRUSDAY");
			break;
	case 5:
			printf("\nFRIDAY");
			break;
	case 6:
			printf("\nSATURDAY");
			break;
	case 7:
			printf("\nSUNDAY");
			break;
	default :
		printf("\nINVALID INPUT");
	}
}
