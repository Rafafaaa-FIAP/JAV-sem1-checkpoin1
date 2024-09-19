package checkpoint1;

public class Carro {

	/* Exercício 1
	   Crie uma classe `Carro` com os seguintes atributos:
	   	• marca
	   	• modelo
		• ano
		• quilometragem */
	
	String marca;
	String modelo;
	int ano;
	float quilometragem;
	
	public void processarMarca() {
		/* Exercício 3
		   Crie um método na classe Carro que receba a marca de um carro e converte
		   para maiúsculo se maior que 7 caracteres, caso contrário, minúsculo.
		   Efetue a chamada da classe de teste. */
		
		if (this.marca.length() > 7) {
			this.marca = this.marca.toUpperCase();
		}
		else {
			this.marca = this.marca.toLowerCase();
		}
	}
	
	public float horas(float distancia, float velocidade) {
		/* Exercício 4
		   Crie um método na classe Carro que receba distância do destino (KM) e
		   velocidade média do carro (KM) e devolva a quantidade em horas do percurso.
		   Efetue a chamada da classe de teste.

           Fórmula: distancia = velocidade * tempo */
		
		float horas = distancia / velocidade;
		
		return horas;
	}

	public void verificarAno() {
		/* Exercício 5
		   Crie um método na classe Carro que receba o ano do veículo
		   e valide se o mesmo é menor que 1980.
		   Em caso de afirmativo, informar o usuário que o sistema
		   não permite a inclusão.*/
		
		if (this.ano < 1980) {
			System.out.println("Sistema não permite inclusão de carros de ano inferior a 1980");
		}
	}
}
