package reajustesalarial;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salario = 0;
		float reajuste = 0;
		
		System.out.print("Insira o valor do sálario a ser reajustado: ");
		salario = leitor.nextFloat();
		
		System.out.print("Insira o percentual de reajuste: ");
		reajuste = leitor.nextFloat();
		
		reajuste = (float) (reajuste / 100);
		
		salario = salario + (salario * reajuste);
		
		System.out.print("O valor do sálario reajustado é: " + salario);
		

	}

}
