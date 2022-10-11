package klasser;

class Human {
	//Human properties
	String name;
	String nameOfPartner;
	int age;
	int height;
	
	
	//Constructor
	Human(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//Human behavior
	void talk(String speak) {
		System.out.println(name + " says: " + speak);
	}
	
	//This method has a parameter of type Human
	void assignPartner(Human partner, boolean firstAssignment) {
		nameOfPartner = partner.name;
		
		//Call assign partner only if it's the first assignment
		//'this' is the object from where this method was called
		if(firstAssignment) partner.assignPartner(this, false);
		
		/*
		 * In our example in main this means that
		 * 1. human2 gets passed as an argument to the method assignPartner of human1
		 * 2. The name of human2 (Sandra) is assigned to the field nameOfPartner of human1
		 * 3. Since it's the first assignment human1 ('this') gets passed as an argument to the method assignPartner of human2
		 * 4. The name of human1 (Pontus) is assigned to the field nameOfPartner of human2
		 * 5. Since it's not the first assignment (firstAssigment is false) no more partners are assigned
		 * */
	}
}
