public class Conversor {
    private final ApiService apiService;

    public Conversor(ApiService apiService) {
        this.apiService = apiService;
    }

    public void converter(String moedaOrigem, String moedaDestino, double valor) {
        double taxa = apiService.obterTaxaDeCambio(moedaOrigem, moedaDestino);
        if (taxa == 0) {
            System.out.println("Não foi possível obter a taxa de câmbio.");
            return;
        }

        double resultado = valor * taxa;
        System.out.printf("%.2f %s = %.2f %s%n", valor, moedaOrigem, resultado, moedaDestino);
    }
}
