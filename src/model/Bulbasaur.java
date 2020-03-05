package model;


//PROGRESSION - 2 
//Go to JAVA Resources - src/model and create a child class called Bulbasaur inside the model package with the following arguments
//String characteristics 
//String type
//String evolution
//String baseExp
//
//Bulbasaur must extend the Pokemon class
//Generate appropriate getters and setters
//Generate a six argument constructor with the following arguments (pokemonName,pokemonNumber,characteristics,type,evolution,baseExp) and pokemonName and pokemonNumber should refer to the parent constructor in the Pokemon class. 
//Use the predefined values given below as constructor arguments 
//pokemonName = Bulbasaur
//pokemonNumber = 001
//characteristics = "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region."
//type = "POISON"
//evolution = "IVYSAUR"
//baseExp = "64" 


public class Bulbasaur extends Pokemon {
	int pokemonNumber = 001;

	public Bulbasaur(String pokemonName, int pokemonNumber) {
		super(pokemonName);
		this.pokemonNumber = pokemonNumber;
	}
	
	public String characteristics() {
		return "Bulbasaur is a Grass/Poison-type Pokémon introduced in Generation I. It evolves into Ivysaur starting at level 16. It is one of the three Starter Pokémon in the Kanto region.";
	}
	
	public String type() {
		return "POISON";
	}
	
	public String evolution() {
		return "IVYSAUR";
	}
	
	public String baseExp() {
		return "64";
	}
}


