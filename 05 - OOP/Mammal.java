package klasser;

class Mammal {
	//Mammal properties
	String family;
	String sound;
	int weight;
	int numberOfLegs;
	boolean standingOnTwoLegs;
	boolean breastFeeding = true; //same value for all mammals
	int energy = 50;
	
	//The constructor
	//All properties that need to be unique for each mammal should be a parameter in the constructor
	Mammal(String family, String sound, int weight, int numberOfLegs, boolean standingOnTwoLegs){
		
		//this.family refers to the object field
		//family refers to the parameter
		this.family = family;
		this.sound = sound;
		this.weight = weight;
		this.numberOfLegs = numberOfLegs;
		this.standingOnTwoLegs = standingOnTwoLegs;
	}
	
	//Mammal behaviors
	
	void sleep(int hours) {
		energy = energy + (5*hours);
	}

	void talk() {
		System.out.println(sound);
	}
	
}
