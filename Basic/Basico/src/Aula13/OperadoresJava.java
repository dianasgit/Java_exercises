package Aula13;

public class OperadoresJava {

	public static void main(String[] args) {

		/* the operators are SIMBOS THAT ASK TO THE COMPILES TO REALIZE AN OPERATION
		 * *******ARITIMETICOS: %, /, *, +, -, ++, --
		 * the + can bu also used to contatenar String (juntar extos, chars, para imprimir ou apenas criar uma outra var que concatene diversas strings)
		 * the ++ or -- can be write before or after the number or namevar BUT THERE ARE DIFFERENCE
		 * IF the ++ comes before, the java calculate first and then after use ou print the number ou var...
		 * if it came later the java will first use or print e the var and only after will sum in the memory, will not print the add number
		 * 
		 * 
		 * RELACIONAIS: == equal; != difference; > ; < ; >= ; <= . 
		 * o resultado da comparação é um boolean true or false.
		 * são muito utilizados em condicionais
		 * 
		 * LOGICOS: & AND only true when2true ; && ANDCURTO ; ! NOT; |OR if 1true then true; ^ XOR equals= false... differentes=true ; || ORCURTO ; 
		 * **no dia a dia da programação java se usa o && pois ele poupa tempo a medida que se a primeira variavel é falsa, ele nem analisa a segunda pois já se sabe que vai ser falso por ex.
		 * isso funciona tb com o ou ||
		 * isso fica visível quando debugamos
		 * 
		 * DE ASSIGNMENT
		 * PRECEDÊNCIA
		 * BITWISE?
		 * 
		 * 
		 * 
		 * 
		 */
		
		int resultado = 50;
		
		System.out.println("Print 50: " +resultado);
		
		System.out.println("Print 50++ note the value: "+ resultado++);
		System.out.println("Print ++50 note the value: " + ++resultado);
		
	}

}
