import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiService apiService = new ApiService();
        Conversor conversor = new Conversor(apiService);

        while (true) {
            System.out.println("\n=== Conversor de Moedas ===");
            System.out.println("1 - Dólar (USD) -> Real (BRL)");
            System.out.println("2 - Real (BRL) -> Dólar (USD)");
            System.out.println("3 - Euro (EUR) -> Real (BRL)");
            System.out.println("4 - Real (BRL) -> Euro (EUR)");
            System.out.println("5 - Libra (GBP) -> Real (BRL)");
            System.out.println("6 - Real (BRL) -> Libra (GBP)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }

            System.out.print("Digite o valor a ser convertido: ");
            double valor = scanner.nextDouble();

            switch (opcao) {
                case 1 -> conversor.converter("USD", "BRL", valor);
                case 2 -> conversor.converter("BRL", "USD", valor);
                case 3 -> conversor.converter("EUR", "BRL", valor);
                case 4 -> conversor.converter("BRL", "EUR", valor);
                case 5 -> conversor.converter("GBP", "BRL", valor);
                case 6 -> conversor.converter("BRL", "GBP", valor);
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}