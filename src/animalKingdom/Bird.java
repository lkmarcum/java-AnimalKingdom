package animalKingdom;

public class Bird extends Animal 
{
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public abstract String move()
	{
		return "fly"
	}

	@Override
	public abstract String breath()
	{
		return "lungs"
	}
	
	@Override
	public abstract String reproduce()
	{
		return "eggs"
	}
}