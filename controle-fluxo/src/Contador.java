import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int parametroUm = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int parametroDois = scanner.nextInt();

            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado. Por favor, tente novamente.");
        } finally {
            scanner.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int diferenca = parametroDois - parametroUm;

        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

