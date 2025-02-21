package Aula14;
import java.util.Scanner;
public class ControlStructures {

	public static void main(String[] args) {

		Scanner digite = new Scanner(System.in);
		
/*		System.out.println("Entre com sua idade: ");
		int idade = digite.nextInt();
		
		if(idade >=18) {
			System.out.println(idade+": É maior de idade.");
		}
		else {
			System.out.println(idade +": Não é maior de idade.");
		}
*/
	
		/*
		
		System.out.println("Entre com o preço do ítem: "); 
		double preco = digite.nextDouble();
		
		if(preco <=10) {
			System.out.println("Pode comprar está barato!");
		} else if (preco > 10 && preco <15) {
			System.out.println("Peça um desconto...");
		} else if (preco >=15 && preco <20) {
			System.out.println("Pesquise mais, está meio caro ..");
		} else {
			System.out.println("Não compre, está caro!");
		}
		
		
	*/
		System.out.println("Digite uma letra e descubra se ela é vogal ou consoante: ");
		String letra = digite.next();
		
		if ( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ) {
			System.out.println("A letra "+ letra +" é vogal.");
		} else if (letra.length() >1) { //cardinality of the string
			System.out.println("Valor digitado inválido");
		}else {
			System.out.println("A letra " + letra + " é consoante.");
		}
		
	}

}
