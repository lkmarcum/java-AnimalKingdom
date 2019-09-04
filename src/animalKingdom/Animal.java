package animalKingdom;

public abstract class Animal 
{
	int maxId = 0;

	int id;
	String name;
	int yearDiscovered;

	public Animal(String name, int yearDiscovered)
	{
		maxId++;

		id = maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public String eat()
	{
		return name + " is eating.";
	}

	public abstract String move();
	public abstract String breath();
	public abstract String reproduce();
}