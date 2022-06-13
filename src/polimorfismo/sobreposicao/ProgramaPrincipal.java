package polimorfismo.sobreposicao;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		Mamifero m=new Mamifero();
		Reptil r=new Reptil();
		Peixe p=new Peixe();
		Ave a = new Ave();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra n = new Cobra ();
		Tartaruga t = new Tartaruga();
		Goldfish g= new Goldfish();
		Arara b = new Arara();
		
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		r.locomover();
		r.alimentar();
		r.emitirSom();
		
		p.locomover();
		p.alimentar();
		p.emitirSom();
		
		a.locomover();
		a.alimentar();
		a.emitirSom();
		
		c.locomover();
		c.alimentar();
		c.emitirSom();
		
		k.locomover();
		k.alimentar();
		k.emitirSom();
		
		n.locomover();
		n.alimentar();
		n.emitirSom();
		
		t.locomover();
		t.alimentar();
		t.emitirSom();
		
		g.locomover();
		g.alimentar();
		g.emitirSom();
		
		b.locomover();
		b.alimentar();
		b.emitirSom();
		
		
		
	}

}
