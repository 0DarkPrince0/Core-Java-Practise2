package str;

public class Game {

	int points;
	String name;
	Game winner(Game g3)
	{
		if(this.points>g3.points)
		{
			return this;
		}
		else
			return g3;
	}
	public static void main(String[] args) {

		Game g1=new Game();
		g1.points=100;
		g1.name="Sonali";
		
		Game g2=new Game();
		g2.points=90;
		g2.name="Tiwari";
		
		Game g=g1.winner(g2);
		System.out.println(g.name+" "+g.points);
	}

}
