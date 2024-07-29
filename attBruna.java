import java.util.Scanner;

public class attBruna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor em reais (R$): ");
        double value = 0;
        do { // Faz uma validacao caso o usuario informe um numero nao positivo
            if (scanner.hasNextDouble()) { // Valida se o input e do tipo double.
                value = scanner.nextDouble();
                if (value <= 0) {
                    System.out.print("Digite um valor positivo: ");
                } else {
                    printCurrency(value);
                }
            } else {
                System.out.println("Entrada inválida, informe um valor numérico: ");
            }
        } while (value <= 0);

    }
    // Metodo para printar na tela os valores e cedulas
     private static void printCurrency(double value) {
        int currencies[] = {100, 50, 25, 10, 5};
        for (int i = 0; i < currencies.length; i++) {
            int currency = currencies[i];
            int quantity =  (int) (value / currency) ; // calcula quantas células são necessárias, usa-se o tipo de variavel inteiro para não ter casas decimais

            if ( quantity > 0 ) {
                System.out.println(quantity + " cédulas de R$ " + currency);
                value = value % currency; // Atualiza o valor restante calculando o resto da operacao com o operador ( % )
            }

        }

    }
}
