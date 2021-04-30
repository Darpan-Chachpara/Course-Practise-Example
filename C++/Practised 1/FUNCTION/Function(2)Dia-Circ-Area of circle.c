#include<stdio.h>
double Diameter(double radius);
double Circumference(double radius);
double Area(double radius);
main()
{
	double radius,dia,circ,area;
	printf("\n ENTER THE RADIUS \n\n");
	scanf("%lf",&radius);
	
	dia=Diameter(radius);
	circ=Circumference(radius);
	area=Area(radius);
	
	printf("\nDiameter of the circle = %.3lf\n",dia);
	printf("\nCircumference of the circle = %.3lf\n",circ);
	printf("\nArea of the circle = %.3lf\n",area);
}

double Diameter(double radius)
{
	return(2*radius);
}

double Circumference(double radius)
{
	return(2*3.14*radius);
}

double Area(double radius)
{
	return(3.14*radius*radius);
}
