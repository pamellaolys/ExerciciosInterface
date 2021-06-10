package br.com.generation.interfaces;

public class Cachorro extends Animal implements InterfaceAnimal {

	@Override
	public void locomover() {
	System.out.println(" Cachorro correndo ....");
		
	}

	@Override
	public void somAnimal() {
		System.out.println(" au au au au au ");
		
	}

	
}
