package lectutre;

public class DynamicPolymorphism 
{

	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.eat();
		a=new Dog();
		a.eat();
		a=new Cat();
		a.eat();
	}
}

class Animal
{
	void eat()
	{
		System.out.println("XYZ");
	}
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("MNO");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("PGR");
	}
}