package animalKingdom;

public class Mammal extends Animal 
{
	private static int maxId = 0;
	private int id;

	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
		maxId++;
		id = maxId;
	}

	@Override
	public String move()
	{
		return "walk";
	}

	@Override
	public String breath()
	{
		return "lungs";
	}
	
	@Override
	public String reproduce()
	{
		return "live births";
	}

	@Override
	public String toString()
	{
		return "\nMammal {id: " + id + ", name: " + name + ", year discovered: " + yearDiscovered + "}";
	}
}