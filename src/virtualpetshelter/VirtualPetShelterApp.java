package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter newShelter = new VirtualPetShelter();

		VirtualPet rose = new VirtualPet("Rose", "Rabbit", "Running", 5, 5, 5);
		VirtualPet blanche = new VirtualPet("Blanche", "Bobcat", "Baseball", 2, 2, 2);
		VirtualPet dorothy = new VirtualPet("Dorothy", "Donkey", "Dip n Dots", 3, 3, 3);
		VirtualPet sophia = new VirtualPet("Sophia", "Sheep", "Sleeping", 4, 4, 4);

		newShelter.addPet(rose);
		newShelter.addPet(blanche);
		newShelter.addPet(dorothy);
		newShelter.addPet(sophia);

		System.out.println("Robs Humane Society");
		System.out.println("This is the status of our pets:");
		System.out.println();

		System.out.println("Name\tHunger\tThirst\tBoredom\tHobby");
		System.out.println("_____________________________________________");

		for (VirtualPet currentPet : newShelter.allPets()) {
			System.out.println(currentPet.name + "\t" + currentPet.hunger + "\t" + currentPet.thirst + "\t"
					+ currentPet.play + "\t" + currentPet.hobby);
			System.out.println("_____________________________________________");
		}

		boolean goToShelter = false;
		while (!goToShelter) {

			System.out.println();
			System.out.println("Select a number to continue");
			System.out.println(" ______________________");
			System.out.println("|                      |");
			System.out.println("| 1. Feed              |");
			System.out.println("| 2. Water             |");
			System.out.println("| 3. Play With Pet     |");
			System.out.println("| 4. Adoption          |");
			System.out.println("| 5. Drop off a Pet    |");
			System.out.println("| 6. Quit              |");
			System.out.println("|______________________|");

			String userResponse = input.next();

			switch (userResponse) {
			case "1":
				newShelter.feedAllPets();
				System.out.println("You fed the herd.");
				System.out.println("Everyone enjoyed chow time.");
				break;

			case "2":
				newShelter.waterAllPets();
				System.out.println("All the pets got hydrated.");
				break;

			case "3":
				System.out.println("What pet would you like to play with?");
				System.out.println("Enter their name to continue.");
				for (VirtualPet currentPet : newShelter.allPets()) {
					System.out.println(currentPet.name + ", the " + currentPet.description);
				}
				String petToPlayWith = input.next();
				newShelter.whatPet(petToPlayWith).playTime();

				System.out.println("You played with " + petToPlayWith);
				break;

			case "4":
				System.out.println("Which pet do you want to adopt? Enter their name below.");
				for (VirtualPet currentPet : newShelter.allPets()) {
					System.out.println(currentPet.name + ", " + currentPet.description);
				}

				String petNameToAdopt = input.next();

				newShelter.adoptPet(petNameToAdopt);
				System.out.println("You adopted " + petNameToAdopt);
				System.out.println("");
				break;

			case "5":
				System.out.println("Someone found another stray.");
				System.out.println("What would you like to name your pet?");
				String newPetName = input.next().toLowerCase();
				System.out.println("What kind of animal is this?");
				String newPetDescription = input.next();
				System.out.println("What is " + newPetName + "'s hobby?");
				String newPetHobby = input.next();
				VirtualPet strayPet = new VirtualPet(newPetName, newPetDescription, newPetHobby);
				newShelter.addPet(strayPet);
				System.out.println("We will take good care of " + newPetName + " and find them a good home.");
				break;

			case "6":
				System.out.println("You have left Robs Humane Society.");
				System.exit(0);

			}

			System.out.println("\nCurrent Status of Robs Pets");

			System.out.println("Name\tHunger\tThirst\tBoredom\tHobby");
			System.out.println("____________________________________________");

			for (VirtualPet current : newShelter.allPets()) {
				System.out.println(current.name + "\t" + current.hunger + "\t" + current.thirst + "\t" + current.play
						+ "\t" + current.hobby);
				System.out.println("____________________________________________");

			}

			newShelter.tickAllPets();

		}

		input.close();

	}
}
