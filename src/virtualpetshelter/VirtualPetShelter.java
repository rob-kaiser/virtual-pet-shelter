package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> robsHumaneSociety = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> allPets() {
		return robsHumaneSociety.values();

	}
	
	public VirtualPet whatPet(String name) {
		return robsHumaneSociety.get(name);
	}

	public void feedAllPets() {
		for (VirtualPet p : robsHumaneSociety.values()) {
			p.feedPet();
		}
	}

	public void waterAllPets() {
		for (VirtualPet p : robsHumaneSociety.values()) {
			p.waterPet();
		} 
	}

	public void addPet(VirtualPet newPet) {  
		robsHumaneSociety.put(newPet.name.toLowerCase(), newPet);

	}

	public void adoptPet(String removedPet) {
		robsHumaneSociety.remove(removedPet);

	}
	
	
	public void playWithASinglePet(VirtualPet playWithOnePet) {
		playWithOnePet.playTime();
	}

	public void tickAllPets() {
		for (VirtualPet p : robsHumaneSociety.values()) {
			p.tick();
		}
	}
}
