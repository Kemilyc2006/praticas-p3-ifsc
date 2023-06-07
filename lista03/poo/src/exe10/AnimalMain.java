package exe10;

public class AnimalMain {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		a.nomeCientifico = "Hemidactylus mabouia";
		a.familia = "Geconídeos";
		a.reino ="Animalia";
		
		System.out.println(a.nomeCientifico);
		System.out.println(a.familia);
		System.out.println(a.reino);
		
		String[] nomeDados = new String[5];
		
		
		nomeDados[0] = "calango";
		nomeDados[1] = "dinossauro";
		nomeDados[2] = "largatixa";
		nomeDados[3] = " lagartixas-diurnas";
		nomeDados[4] = "lagartixa-gato";
		
		a.nomeAnimal = nomeDados; 
		for(int i =0; i<a.nomeAnimal.length; i++) {
			System.out.println(a.nomeAnimal[i]);
		}
	}

}
