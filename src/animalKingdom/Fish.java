package animalKingdom;

public class Fish extends Animal 
{
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public abstract String move()
	{
		return "swim"
	}

	@Override
	public abstract String breath()
	{
		return "gills"
	}
	
	@Override
	public abstract String reproduce()
	{
		return "eggs"
	}
}