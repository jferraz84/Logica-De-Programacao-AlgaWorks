package capitulo04;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		
		Integer adicao =1 + 1;
		System.out.println("Resultado adição: " + adicao);
		
		Integer subtracao = 8 - 1;
		System.out.println("Resultado subtração: " + subtracao);
		
		Integer multiplicacao =5 * 5;
		System.out.println("Resultado multiplicação: " + multiplicacao);
		
		Integer divisao =25 / 5;
		System.out.println("Resultado divisão: " + divisao);
		
		Integer modulo =7 % 4;
		System.out.println("Resultado modulo (resto da divisão): " + modulo);
		
		Integer precedencia01 = 1 + 1 * 5;
		System.out.println("Resultado precedencia01: " + precedencia01);
		
		Integer precedencia02 = (1 + 1) * 5;
		System.out.println("Resultado precedencia02: " + precedencia02);
		
		Integer precedencia03 = (1 + 1) * 5 - 2 / 2;
		System.out.println("Resultado precedencia03: " + precedencia03);
		
		Integer precedencia04 = 5 * 5 / 5 + 25 - 5;
		System.out.println("Resultado precedencia04: " + precedencia04);
	}

}
