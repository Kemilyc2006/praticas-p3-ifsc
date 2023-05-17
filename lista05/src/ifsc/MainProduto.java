package ifsc;
import java.util.ArrayList;


public class MainProduto {
	public static void main(String[]args) {
		Produto p1 = new Produto(); 
		Produto p2 = new Produto(); 
		Produto p3 = new Produto(); 
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		p1.setNome ("Boneco do Lucas Neto");
		p1.setCodBarras (5607948224756683l);
		p1.setPreco (500.00);
		p1.setFornecedor("Casas Havan");
		produtos.add(p1);
		
		p2.setNome ("Capa da invisibilidade do Harry Potter");
		p2.setCodBarras (560794356754256683l);
		p2.setPreco (100.00);
		p2.setFornecedor("Hogwarts");
		produtos.add(p2);
		
		p3.setNome ("Casa da Barbie: em tamanho real");
		p3.setCodBarras (56079435675422383l);
		p3.setPreco (1000000000000.00);
		p3.setFornecedor("Disneyland");
		produtos.add(p3);

		for (Produto produto : produtos) {
			System.out.println(produto.getNome());
			System.out.println(produto.getCodBarras());
			System.out.println(produto.getPreco());
			System.out.println(produto.getFornecedor());
			
		}
	}
	

}
