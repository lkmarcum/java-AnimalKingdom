package animalKingdom;

public abstract class Animal 
{
	String name;
	int yearDiscovered;
	int id;
	private static int maxId = 0;

	public Animal(String name, int yearDiscovered)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public String eat()
	{
		return name + " is eating";
	}

	public int getYearDiscovered()
	{
		return yearDiscovered;
	}

	public String getName()
	{
		return name;
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}