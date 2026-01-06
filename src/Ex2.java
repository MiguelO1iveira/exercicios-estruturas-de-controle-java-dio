import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			// VARIÁVEIS
			float peso, altura, imc;
			String message = "";
			
			// SAUDAÇÃO
			System.out.println("BEM-VINDO!!");
			System.out.println("=== CÁLCULO DO IMC ===");
			
			// ENTRADA DE DADOS
			System.out.println("Digite o peso: ");
			System.out.print(">>> ");
			peso = Float.parseFloat(scanner.nextLine());
			
			System.out.println("Digite a altura: ");
			System.out.print(">>> ");
			altura = Float.parseFloat(scanner.nextLine());
			
			// CALCULAR
			imc = peso / (altura * altura);
			
			if (imc <= 18.5) message = "abaixo do peso";
			else if (imc < 25) message = "com o peso ideal";
			else if (imc < 30) message = "levemente acima do peso";
			else if (imc < 35) message = "com obesidade Grau I";
			else if (imc < 40) message = "com obesidade Grau II (Severa)";
			else message = "com obesidade III (Mórbida)";
			// ===========
			
			// RESULTADO
			System.out.println("\nResultado: ");
			System.out.printf("Você está %s!\nSeu imc é igual a %.2f.\n", message, imc);
			
		} // TRY PRINCIPAL
		

	}

}
