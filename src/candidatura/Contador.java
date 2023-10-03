package candidatura;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmentro");
        int parameterOne = terminal.nextInt();
        System.out.println("Digite o segundo parâmentro");
        int parameterTwo = terminal.nextInt();

        try {
            tell(parameterOne, parameterTwo);
        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void tell(int parameterOne, int parameterTwo) throws ParametrosInvalidosException {
        if (parameterOne > parameterTwo) {
            throw new ParametrosInvalidosException();
        }
        int score = parameterTwo - parameterOne;

        for (int i = 0; i < score; i++) {
            System.out.println("Imprimindo um número " + i);
        }
    }

}
