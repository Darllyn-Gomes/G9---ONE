import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorMoedas {

    public static String converter(int opcao, double valor) throws IOException, InterruptedException{

        HttpClient client = HttpClient.newHttpClient();
        Gson gson = new Gson();

        String base = "";
        String destino = "";

        switch (opcao){
            case 1 -> {base = "USD"; destino = "BRL";}
            case 2 -> {base = "BRL"; destino = "USD";}
            case 3 -> {base = "USD"; destino = "ARS";}
            case 4 -> {base = "ARS"; destino = "USD";}
            case 5 -> {base = "USD"; destino = "EUR";}
            case 6 -> {base = "EUR"; destino = "USD";}
            default -> {
                System.out.println("Opção inválida!");

            }
        }
        String apiKey = "f33a59b22078a15ebb9c6b1a";
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + base;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() != 200) {
            System.out.println("Erro ao acessar a API. Código HTTP: " + response.statusCode());

        }

        JsonObject json = gson.fromJson(response.body(), JsonObject.class);
        JsonObject taxas = json.getAsJsonObject("conversion_rates");

        if (!taxas.has(destino)) {
            System.out.println("Moeda de destino inválida ou não suportada pela API.");

        }

        double taxa = taxas.get(destino).getAsDouble();
        double valorConvertido = valor * taxa;

        String resultado = "Valor convertido de " + base + " para " + destino + ": " + valorConvertido;

        return resultado;
    }

    }


