package animalKingdom;

import java.util.*;

public class Main 
{
	public static void printAnimals(ArrayList<Animal> animals, CheckAnimal tester)
	{
		for (Animal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.getName() + " " + a.getYearDiscovered() + " " + a.move() + " " + a.breath() + " " + a.reproduce());
			}
		}
	}

	public static void main(String[] args)
	{
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<Animal> myList = new ArrayList<Animal>();

		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);
		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);
		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		System.out.println("*** Original ArrayList ***");
		System.out.println(myList.toString());

		System.out.println();

		myList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
		System.out.println("*** Sorted by Year Named *** ");
		System.out.println(myList.toString());

		System.out.println();

		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println("*** Sorted Alphabetically by Name ***");
		System.out.println(myList.toString());

		System.out.println();

		myList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		System.out.println("*** Sorted by Movement ***");
		System.out.println(myList.toString());

		System.out.println();

		System.out.println("*** Animals that Breathe with Lungs ***");
		printAnimals(myList, a -> a.breath() == "lungs");

		System.out.println();

		System.out.println("*** Animals that Breathe with Lungs & Named in 1758 ***");
		printAnimals(myList, a -> (a.breath() == "lungs") && (a.getYearDiscovered() == 1758));

		System.out.println();

		System.out.println("*** Animals that Lay Eggs & Breathe with Lungs ***");
		printAnimals(myList, a -> (a.breath() == "lungs") && (a.reproduce() == "eggs"));

		System.out.println();

		myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		System.out.println("*** Animals that Breathe with Lungs & Named in 1758 ***");
		printAnimals(myList, a -> a.getYearDiscovered() == 1758);
	}
}