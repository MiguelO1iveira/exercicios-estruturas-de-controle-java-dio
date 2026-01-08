import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num1, num2, result = 0, i = 2;
			
			String message;
			
			System.out.println("Informe o 1° número: ");
			System.out.print(">>> ");
			num1 = Integer.parseInt(scanner.nextLine());
			
			message = String.valueOf(num1);
			
			//LOOP PARA RECEBER O SEGUNDO NÚMERO
			do {
				System.out.printf("Informe o %s° número: \n", i);
				System.out.print(">>> ");
				num2 = Integer.parseInt(scanner.nextLine());
				
				if (num2 < num1) {
					System.out.println("Por favor, digite um número maior que o 1°!");
					continue;
				} else {
					result = num2 % num1;
					message += " " + num2;
					System.out.printf("%s %% %s == %s\n\n", num1, num2, result);
					i++;
				}
				
				
			} while(result == 0);
			
			System.out.println("Resultado: ");
			System.out.printf("Números digitados: %s", message);
			System.out.println("\nEncerrando...");
		} //TRY PRINCIPAL

	}

}
