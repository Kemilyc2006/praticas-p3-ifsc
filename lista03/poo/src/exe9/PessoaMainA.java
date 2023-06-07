package exe9;


public class PessoaMainA {

	public static void main(String[] args) {
		
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		
		
		p1.cpf = 1023456756l;
		p1.nome = "Wanilda";
		p1.nascimento = "12/07/88";
		
		p2.cpf = 1223252726l;
		p2.nome = "Wellington";
		p2.nascimento = "22/02/28";
		
		p3.cpf = 1223252726l;
		p3.nome = "Williamn";
		p3.nascimento = "02/09/02";
		
System.out.println("A pessoa de nome "+ p1.nome + " tem o CPF nº" + p1.cpf+" e nasceu em "+p1.nascimento);
System.out.println("A pessoa de nome "+ p2.nome + " tem o CPF nº" + p2.cpf+" e nasceu em "+p2.nascimento);
System.out.println("A pessoa de nome "+ p3.nome + " tem o CPF nº" + p3.cpf+" e nasceu em "+p3.nascimento);


		        
	}

}
