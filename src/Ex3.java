import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			// VARIÁVEIS
			int num1, num2, op;
			boolean isNotBigger;
			
			System.out.println("BEM-VINDO!!");
			System.out.println("=== NÚMEROS PARES OU ÍMPARES ===");
			System.out.println("\nInforme o primeiro número: ");
			System.out.print(">>> ");
			num1 = Integer.parseInt(scanner.nextLine());
			
			
			do {
				System.out.println("\nInforme o segundo número: ");
				System.out.print(">>> ");
				num2 = Integer.parseInt(scanner.nextLine());
				
				isNotBigger = num2 <= num1; // PARA VERIFICAR SE O SEGUNDO É MAIOR QUE O PRIMEIRO
				
				if (isNotBigger) System.out.println("\n[ERRO] Por favor, digite o segundo número maior que o primeiro!\n");
			} while (isNotBigger);
			
			
			// SOLICITAR A OPÇÃO
			do {
				System.out.println("=== EXIBIR ===");
				System.out.println("[1] ÍMPAR");
				System.out.println("[2] PAR");
				System.out.println("[0] CANCELAR");
				System.out.println("Digite a opção: ");
				System.out.print(">>> ");
				op = Integer.parseInt(scanner.nextLine());
				
			} while(op < 0 || op > 2);
			
			// ESTRUTURA DE ESCOLHA
			switch(op) {
				case 0 -> {
					System.out.println("Operação cancelada!");
				} // CASE 0
				
				case 1 -> {
					System.out.println("=== NÚMEROS ÍMPARES ===");
					for (int i = num2; i >= num1; i--) {
						
						if (i % 2 != 0) System.out.printf("%s", i);
						
					} // FOR
					
				} // CASE 1
				
				case 2 -> {
					System.out.println("=== NÚMEROS PARES ===");
					for (int i = num2; i >= num1; i--) {
						
						if (i % 2 == 0) System.out.printf("%s", i);
						
					} // FOR
					
				} // CASE 1
				
			} // SWITCH
			
			
			System.out.println("\n\nEncerrando...");
			
			
			
			
			
		} // TRY

	}

}
