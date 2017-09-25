package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter newShelter = new VirtualPetShelter();

		VirtualPet rose = new VirtualPet("Rose", "Rabbit", "Running", 5, 4, 6, 7, 8);
		VirtualPet blanche = new VirtualPet("Blanche", "Bobcat", "Baseball", 2, 3, 2, 3, 6);
		VirtualPet dorothy = new VirtualPet("Dorothy", "Donkey", "Dancing", 6, 3, 4, 11, 9);
		VirtualPet sophia = new VirtualPet("Sophia", "Sheep", "Sleeping", 4, 6, 8, 8, 6);

		newShelter.addPet(rose);
		newShelter.addPet(blanche);
		newShelter.addPet(dorothy);
		newShelter.addPet(sophia);

		System.out.println("Robs Humane Society");
		System.out.println("These are the animals we currently have:");
		System.out.println();

		System.out.println("Name\t|Type\t|Hunger\t|Thirst\t|Play\t|Hobby\t\t|Age\t|Cleanliness");
		System.out.println("____________________________________________________________________________");

		for (VirtualPet currentPet : newShelter.allPets()) {
			System.out.println(currentPet.name + "\t|" + currentPet.description + "\t|" + currentPet.hunger + "\t|"
					+ currentPet.thirst + "\t|" + currentPet.play + "\t|" + currentPet.hobby + "\t|" + currentPet.age
					+ "\t|" + currentPet.cleanliness);

			System.out.println("____________________________________________________________________________");
		}

		boolean closeShelter = false;
		while (!closeShelter) {

			System.out.println();
			System.out.println("Select a number to continue");
			System.out.println(" ______________________");
			System.out.println("|                      |");
			System.out.println("| 1. Give Food         |");
			System.out.println("| 2. Give Water        |");
			System.out.println("| 3. Play With a Pet   |");
			System.out.println("| 4. Adopt             |");
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
				newShelter.whatPet(petToPlayWith.toLowerCase()).playTime();

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
				System.out.println("How old is this creature?");
				Integer newPetAge = input.nextInt();
				VirtualPet strayPet = new VirtualPet(newPetName, newPetDescription, newPetHobby, newPetAge);
				newShelter.addPet(strayPet);
				System.out.println("We will take good care of " + newPetName + " and find them a good home.");
				break;

			case "6":
				System.out.println("You have left Robs Humane Society.");
				System.exit(0);

			default:
				System.out.println("Invalid entry...Try another selection.");
			}

			System.out.println("\nThese are the animals we currently have: ");

			System.out.println("Name\tType\tHunger\tThirst\tPlay\tHobby\t\tAge\tCleanliness");
			System.out.println("____________________________________________________________________________");

			for (VirtualPet currentPet : newShelter.allPets()) {
				System.out.println(currentPet.name + "\t|" + currentPet.description + "\t|" + currentPet.hunger + "\t|"
						+ currentPet.thirst + "\t|" + currentPet.play + "\t|" + currentPet.hobby + "\t|"
						+ currentPet.age + "\t|" + currentPet.cleanliness);

				System.out.println("____________________________________________________________________________");

				if (currentPet.cleanliness <= 0) {
					newShelter.cleanPets();
					System.out.println(currentPet.name + " was filthy, so all the animals were washed.");
				}
			}
			newShelter.tickAllPets();
		}
		input.close();
	}
}
