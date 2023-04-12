package ifsc;

import java.util.ArrayList;

public class MainVeiculo {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo();
		Veiculo v2 = new Veiculo();
		Veiculo v3 = new Veiculo();
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		
		v1.setNome ("Palio");
		v1.setAno (1995);
		v1.setCor("Amarelo");
		v1.setFabricante ("Fiat");
		v1.setRodas(4);
		veiculos.add(v1);
		
		v2.setNome ("Celta");
		v2.setAno (2006);
		v2.setCor("Vermelho");
		v2.setFabricante ("Chevrolet");
		v2.setRodas(4);
		veiculos.add(v2);
		
		v3.setNome ("Gol");
		v3.setAno (2008);
		v3.setCor("Preto");
		v3.setFabricante ("VW");
		v3.setRodas(4);
		veiculos.add(v3);
		
		for (Veiculo veiculo : veiculos) {
			System.out.println(veiculo.getNome());
			System.out.println(veiculo.getAno());
			System.out.println(veiculo.getFabricante());
			System.out.println(veiculo.getRodas());
			System.out.println(veiculo.getCor());
			
			
		}
	}

}
