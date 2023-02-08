package ifsc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		System.out.println("Insira um nome: ");

		String nome = leitura.nextLine();
		System.out.println("Insira uma idade: ");

		String idadeStr = leitura.nextLine();
		int idade = Integer.valueOf(idadeStr);
		System.out.println(nome + "tem" + idade);

	}

}
