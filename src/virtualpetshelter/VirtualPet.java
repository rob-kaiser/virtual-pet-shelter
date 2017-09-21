package virtualpetshelter;

public class VirtualPet {

	String name;
	String description;
	int hunger;
	int thirst;
	int boredom;

	public VirtualPet(String newname, String newdescription, int newhunger, int newthirst, int newboredom) {
		name = newname;
		description = newdescription;
		hunger = newhunger;
		thirst = newthirst;
		boredom = newboredom;
	}

	public VirtualPet(String newname, String newdescription) {
		name = newname;
		description = newdescription;
	}

	void feedPet() {
		hunger = hunger - 2;
		thirst = thirst + 2;
		boredom = boredom + 1;
	}

	void waterPet() {
		hunger = hunger + 2;
		thirst = thirst - 2;
		boredom = boredom + 1;
	}

	void borePet() {
		hunger = hunger + 2;
		thirst = thirst + 2;
		boredom = boredom + 5;
	}

	void tick() {
		hunger = hunger + 1;
		thirst = thirst + 1;
		boredom = boredom + 1;

	}

}
