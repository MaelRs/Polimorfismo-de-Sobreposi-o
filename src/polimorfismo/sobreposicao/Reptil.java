package polimorfismo.sobreposicao;

public class Reptil extends Animal {
	private String corEscamas;
	
	

	public String getCorEscamas() {
		return corEscamas;
	}

	public void setCorEscamas(String corEscamas) {
		this.corEscamas = corEscamas;
	}

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
		
	}

}
