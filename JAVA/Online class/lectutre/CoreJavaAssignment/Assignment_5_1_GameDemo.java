package lectutre.CoreJavaAssignment;

class Game
{
	//int i=500;
	Game()//Game(int i)
	{
		System.out.println("YOUR ARE IN GAME ! ");
		//System.out.println("LOSS % "+i);

	}
}
class BoradGame extends Game
{
	BoradGame()  //int i in bracket
	{
		//super();//super(i);
		System.out.println("YOU ARE IN BOARD GAME ! ");
		//System.out.println("WIN % "+i);

	}
}
	
class Chess extends BoradGame
{
	Chess()
	{
		//super(80);
		System.out.println("YOU ARE PLAYING CHESS ! ");
	}
}

class Assignment_5_1_GameDemo
{
	public static void main(String[] args)
	{
		Chess ch=new Chess();
	}
}
