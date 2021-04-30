package lectutre;

interface Fruits
{
	int seed =10;
	void taste();
}

class Interface implements Fruits
{
	public void taste()
	{
		System.out.println("SOUR");
	}

	public static void main(String[] args)
	{
		Interface a=new Interface();
		a.taste();
		System.out.println(Fruits.seed);
		System.out.println(seed);
	}

}




/*
 
 interface Apple
 {
 void display();
 }
 
 interface Orange
 {
 public void eat();
 }
 
 class Normal implements Apple,Orange
 {
 
 public void eat()
 {
 System.out.println("XYZ");
 }
 
 public void display()
 {
 System.out.println("MNO");
 }
 
 public static void main(String[] args)
	{
		Normal n=new Normal();
		n.eat();
		n.display();
	}
 }
 
 */
