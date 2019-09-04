package animalKingdom;

public class Bird extends Animal 
{
	private static int maxId = 0;
	private int id;

	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
		maxId++;
		id = maxId;
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
		return "\nBird {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + "}";
	}
}