import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			int num;
			
			// ENTRADA DE DADOS
			System.out.println("\nBEM-VINDO!!");
			System.out.println("Digite um número para retornar a tabuada: ");
			System.out.print(">>> ");
			num = Integer.parseInt(scanner.nextLine());
			
			// LAÇO DE REPETIÇÃO DA TABUADA
			for (int i = 1; i <= 10; i++) {
				System.out.printf("\n%s x %s = %s", num, i, num * i);
			}
			
			
		} // TRY PRINCIPAL
		

	}

}
