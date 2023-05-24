package ifsc;

public class MainAnimal {

	public static void main(String[] args) {
		
		Gato g1 = new Gato();
		Cachorro c1 = new Cachorro();
		
		g1.setNome("Venus");
		g1.setRaca("Angora");
		g1.setComprimento(0.70f);
		g1.setnPatas(3);
		g1.setCor("Branco");
		g1.setEcossistema("Ape da Madonna");
		
		System.out.println(g1.getNome());
		System.out.println(g1.getRaca());
		System.out.println(g1.getComprimento());
		System.out.println(g1.getnPatas());
		System.out.println(g1.getCor());
		System.out.println(g1.getEcossistema());
	    System.out.println();
		g1.mia();
	    System.out.println();

		c1.setNome("Pablo");
		c1.setRaca("Pharaoh Hound");
		c1.setComprimento(1.20f);
		c1.setnPatas(4);
		c1.setCor("Amarelo Queimado");
		c1.setEcossistema("nas ruas");
		
		System.out.println(c1.getNome());
		System.out.println(c1.getRaca());
		System.out.println(c1.getComprimento());
		System.out.println(c1.getnPatas());
		System.out.println(c1.getCor());
		System.out.println(c1.getEcossistema());
	    System.out.println();
		c1.late();
		
		
	}

}
