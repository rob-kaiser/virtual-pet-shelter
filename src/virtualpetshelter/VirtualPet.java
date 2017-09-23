package virtualpetshelter;

public class VirtualPet {

	String name;
	String description;
	String hobby;
	int hunger;
	int thirst;
	int play;

	public VirtualPet(String newName, String newDescription, String newHobby, int newHunger, int newThirst, int newPlay) {
		name = newName;
		description = newDescription;
		hobby = newHobby;
		hunger = newHunger;
		thirst = newThirst;
		play = newPlay;
	}

	public VirtualPet(String newName, String newDescription, String newHobby) {
		name = newName;
		description = newDescription;
		hobby = newHobby;
		hunger = 3;
		thirst = 2;
		play = 1;
	}
	
	void feedPet() {
		hunger = hunger - 2;
		thirst = thirst + 2;
		play = play + 1;
	}

	void waterPet() {
		hunger = hunger + 2;
		thirst = thirst - 2;
		play = play + 1;
	}

	void borePet() {
		hunger = hunger + 2;
		thirst = thirst + 2;
		play = play + 5;
	}

	void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		play = play + 1;

	}
	
	void playTime() {
		hunger = hunger + 2;
		thirst = thirst + 2;
		play = play - 5;
	}

}
