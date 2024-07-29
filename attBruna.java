import java.util.Scanner;

public class attBruna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um valor em reais (R$): ");
        // Faz uma validacao caso o usuario informe um numero não negativo
        if ( scanner.hasNextDouble() ) {
            double value = scanner.nextDouble();
            if ( value <= 0 ) {
                System.out.println("Digite um valor positivo: ");
            } else {
                printCurrency(value);
            }
        } else {
            System.out.println("Entrada inválida, informe um valor numérico: ");
        }
    }

    // Metodo para printar na tela os valores e cedulas
     public static void printCurrency(double value) {
        int currencies[] = {100, 50, 25, 10, 5};
        for (int i = 0; i < currencies.length; i++) {
            int currency = currencies[i];
            int quantity =  (int) (value / currency) ;

            if ( quantity > 0 ) {
                System.out.println(quantity + " cédulas de R$ " + currency);
                value = value % currency;
            }

        }

    }
}
