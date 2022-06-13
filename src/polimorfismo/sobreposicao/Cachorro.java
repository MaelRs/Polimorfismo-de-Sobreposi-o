package polimorfismo.sobreposicao;

public class Cachorro extends Mamifero {
	
	public void enterrarOsso() {
		System.out.println("Enterrando o Osso");
	}
	
	public void abanarRabo() {
		System.out.println("Abanando o rabo");
	}
	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Racao");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}
}
