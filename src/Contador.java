import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            System.out.printf("\nErro ao executar programa. Motivo: %s\n", exception.getMessage());
		} finally {
            terminal.close();
        }
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois)
            throw new ParametrosInvalidosException("O primeiro parâmetro deve ser obrigatoriamente menor que o segundo");
		
		int contagem = parametroDois - parametroUm;
		iterar(contagem);
	}

	private static void iterar(int vezes) {
		for(int x = 1; x <= vezes; x++) {
			System.out.printf("Imprimindo o número %d\n", x);
		}
	}
}