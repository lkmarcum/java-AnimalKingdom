package animalKingdom;

public class Mammal extends Animal 
{
	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public abstract String move()
	{
		return "walk"
	}

	@Override
	public abstract String breath()
	{
		return "lungs"
	}
	
	@Override
	public abstract String reproduce()
	{
		return "live births"
	}
}