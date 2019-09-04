package animalKingdom;

public abstract class Animal 
{
	String name;
	int yearDiscovered;

	public Animal(String name, int yearDiscovered)
	{
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public String eat()
	{
		return name + " is eating";
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}