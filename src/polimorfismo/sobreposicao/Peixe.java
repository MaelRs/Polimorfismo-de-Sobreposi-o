package polimorfismo.sobreposicao;

public class Peixe extends Animal{
	private String corEscama;
	
	public void soltarBolhas() {
		System.out.println("Glub! Glub! Glub!");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Algas");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Não emite som");
		
	}

}
