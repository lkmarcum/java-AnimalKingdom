package animalKingdom;

public class Fish extends Animal 
{
	private static int maxId = 0;
	private int id;

	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
		maxId++;
		id = maxId;
	}

	@Override
	public String move()
	{
		return "swim";
	}

	@Override
	public String breath()
	{
		return "gills";
	}
	
	@Override
	public String reproduce()
	{
		return "eggs";
	}

	@Override
	public String toString()
	{
		return "\nFish {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + "}";
	}
}