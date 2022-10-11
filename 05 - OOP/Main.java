package klasser;

public class Main {

	public static void main(String[] args) {
		//Mammals
		System.out.println();
		System.out.println("_______MAMMALS_______");
		
		//Skapar två instanser av klassen Mammal
		Mammal whale = new Mammal("Cetacean", "oooOOOOooOoOOoooo", 3500, 0, false );
		Mammal platypus = new Mammal("Orny", "klick klick klick rrrrrrrrr", 4, 4, false);
		
		System.out.println();
		System.out.println("_______Whale_Properties_______");
		System.out.println(whale.breastFeeding);
		System.out.println(whale.numberOfLegs);
		System.out.println(whale.family);
		System.out.println(whale.energy);
		whale.sleep(3);
		System.out.println(whale.energy);
		
		System.out.println();
		System.out.println("_______Platypus_Properties_______");
		System.out.println(platypus.breastFeeding);
		System.out.println(platypus.numberOfLegs);
		System.out.println(platypus.family);
		System.out.println(platypus.energy);
		platypus.sleep(7);
		System.out.println(platypus.energy);
		platypus.energy = 0;
		System.out.println(platypus.energy);
		
		System.out.println();
		System.out.println("_______Mammal_Talk_______");
		whale.talk();
		platypus.talk();
		
		
		//Humans
		System.out.println();
		System.out.println("_______HUMANS_______");
		Human human1 = new Human("Pontus", 23, 175);
		Human human2 = new Human("Sandra", 21, 160);
		
		human1.talk("Hej hej!!");
		human2.talk("Men heeeej!");

		System.out.println(human1.name + "'s partner is: " + human1.nameOfPartner);
		System.out.println(human2.name + "'s partner is: " + human2.nameOfPartner);
		
		human1.assignPartner(human2, true);
		
		System.out.println("After assigning human2 as a partner to human1");
		System.out.println(human1.name + "'s partner is: " + human1.nameOfPartner);
		System.out.println(human2.name + "'s partner is: " + human2.nameOfPartner);
	}

}
