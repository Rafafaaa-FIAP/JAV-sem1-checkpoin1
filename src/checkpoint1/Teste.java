package checkpoint1;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		/* Exercício 2
		   Crie uma classe de teste para a classe `Carro` que demonstre a criação
		   de objetos `Carro`, com a chamada a um método que imprima as informações digitadas,
		   apresentando uma descrição legível ao usuário. */
		
		Carro carro = new Carro();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a marca do carro: ");
		carro.marca = scanner.nextLine();
		
		System.out.println("Digite o modelo do carro: ");
		carro.modelo = scanner.nextLine();
		
		System.out.println("Digite o ano do carro: ");
		carro.ano = scanner.nextInt();
		
		System.out.println("Digite a quilometragem do carro: ");
		carro.quilometragem = scanner.nextFloat();
		
		carro.processarMarca();
		System.out.println(carro.marca);
		
		System.out.println(carro.horas(60, 60));
		
		carro.verificarAno();
	}

}
