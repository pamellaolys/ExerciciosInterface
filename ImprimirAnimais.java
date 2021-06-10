package br.com.generation.interfaces;

public class ImprimirAnimais  {

	public static void main(String[] args) {
		
		Cachorro cao1 = new Cachorro();
		Cavalo cavalo1 = new Cavalo();
		Preguica preguica1 = new Preguica();
		
	cao1.setNome("Totó");
	cao1.setIdade(5);
	cao1.setRaca("vira-lata");
	
	cavalo1.setNome("Silver");
	cavalo1.setIdade(20);
	cavalo1.setRaca("Quarto de milha");
	
	preguica1.setNome("Soninho");
	preguica1.setIdade(15);
	preguica1.setRaca("---");
	
	System.out.println("Cachorro: ");
	System.out.println("Nome: "+cao1.getNome());
	System.out.println("Idade: "+cao1.getIdade());
	System.out.println("Raça: "+cao1.getRaca());
	cao1.locomover();
	cao1.somAnimal();
	System.out.println();
	System.out.println("Cavalo: ");
	System.out.println("Nome: "+cavalo1.getNome());
	System.out.println("Idade: "+cavalo1.getIdade());
	System.out.println("Raça: "+cavalo1.getRaca());
	cavalo1.locomover();
	cavalo1.somAnimal();
	System.out.println();
	System.out.println("Preguiça: ");
	System.out.println("Nome: "+preguica1.getNome());
	System.out.println("Idade: "+preguica1.getIdade());
	System.out.println("Raça: "+preguica1.getRaca());
	preguica1.locomover();
	preguica1.somAnimal();
	preguica1.subir();
	
	
	}

}
