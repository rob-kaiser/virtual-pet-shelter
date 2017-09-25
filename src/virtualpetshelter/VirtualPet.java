package virtualpetshelter;

public class VirtualPet {

	String name;
	String description;
	String hobby;
	int cleanliness;
	int age;
	int hunger;
	int thirst;
	int play;

	public VirtualPet(String newName, String newDescription, String newHobby, int newHunger, int newThirst, int newPlay,
			int newAge, int newCleanliness) {
		name = newName;
		description = newDescription;
		hobby = newHobby;
		hunger = newHunger;
		thirst = newThirst;
		play = newPlay;
		age = newAge;
		cleanliness = newCleanliness;
	}

	public VirtualPet(String newName, String newDescription, String newHobby, Integer newAge) {
		name = newName;
		description = newDescription;
		hobby = newHobby;
		hunger = 3;
		thirst = 2;
		play = 1;
		age = newAge;
		cleanliness = 5;
	}

	void feedPet() {
		hunger -= 2;
		thirst += 2;
		play--;
	}

	void waterPet() {
		hunger += 2;
		thirst -= 2;
		play++;
	}

	void tick() {
		hunger++;
		thirst++;
		play++;
		age++;
		cleanliness--;

	}

	void washPet() {
		cleanliness = 10;
	}

	void playTime() {
		hunger++;
		thirst += 2;
		play -= 5;
		cleanliness -= 3;
	}

	void age() {
		hunger = 0;
		thirst = 0;
		play = 0;
		cleanliness = 0;
	}
}
