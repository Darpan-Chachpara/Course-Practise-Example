package lectutre.CoreJavaAssignment;


abstract class Shape
{
	final Double PI =Math.PI;
	abstract Double area();
}

class Circle extends Shape
{
	Double r;
	Circle(Double r )
	{
		super();
		this.r=r;
	}
	
	public Double area()
	{
		return PI*r*r;
	}
}
	
class Cylinder extends Shape
	{
		Double r, h;
		Cylinder(Double r, Double h )
		{
			super();
			this.r=r;
			this.h=h;
		}
		
		public Double area()
		{
			return PI*r*r*h;
		}
	}
class Square extends Shape
		{
			Double s;
			Square(Double s)
			{
				super();
				this.s=s;
				
			}
			
			public Double area()
			{
				return s*s;
			}
		}
			
class Rectangle extends Shape
			{
				Double l;
				Double b;
				Rectangle(Double l ,Double b)
				{
					super();
					this.l=l;
					this.b=b;
					
					
				}
				
				public Double area()
				{
					return l*b;
				}
			}
public class Assignment_6_3_TestShape 
{

	public static void main(String[] args)
	{
		Shape s[] =new Shape[5];
	     for(int i=1;i<5;i++)
	     {
	    	if(i==1)
	    	{
	    		s[i] = new Circle(15.5);
	    		Double result =s[i].area();
	    		System.out.println("Area of Cicle is :" +result);
	    		
	    	}
	    	else if(i==2)
	    	{
	    		s[i] = new Cylinder(5.5,6.0);
	    		Double result =s[i].area();
	    		System.out.println("Area of Cylinder is :" +result);
	    		
	    	}
	    	else if(i==3)
	    	{
	    		s[i] = new Square(6.0);
	    		Double result =s[i].area();
	    		System.out.println("Area of Square is :" +result);
	    		
	    	}
	    	else if(i==4)
	    	{
	    		s[i] = new Rectangle(6.0,6.0);
	    		Double result =s[i].area();
	    		System.out.println("Area of Cylinder is :" +result);
	    	}
	     }
	}

}
