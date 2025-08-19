import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class ApiService {
    private static final String API_KEY = "78a0f139bfe8e538f11b7082"; // substitua pela sua chave
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public double obterTaxaDeCambio(String moedaOrigem, String moedaDestino) {
        try {
            String urlStr = BASE_URL + API_KEY + "/latest/" + moedaOrigem;
            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(conn.getInputStream());
            Gson gson = new Gson();
            ExchangeRates rates = gson.fromJson(reader, ExchangeRates.class);

            return rates.conversion_rates.get(moedaDestino);
        } catch (Exception e) {
            System.out.println("Erro ao consultar API: " + e.getMessage());
            return 0;
        }
    }
}
