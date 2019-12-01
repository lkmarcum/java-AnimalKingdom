package animalKingdom;

public class Bird extends Animal 
{
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public String move()
	{
		return "fly";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}
	
	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
	{
		return "\nBird {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + ", movement: fly, breathing: lungs, reproduction: eggs}";
	}
}