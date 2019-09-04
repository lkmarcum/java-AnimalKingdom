package animalKingdom;

public class Fish extends Animal 
{
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
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
		return "\nFish {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + ", movement: swim, breathing: gills, reproduction: eggs}";
	}
}