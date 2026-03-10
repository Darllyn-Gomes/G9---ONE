
import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""   
                    ======================================
                            Conversor de moedas! :)  
                    ======================================  
                    1) Menu de conversões
                    2) Hitórico
                    3)Sair
                    ======================================
                    """);
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    Menu.exibirMenu();
                    System.out.println("Escolha uma conversão: ");
                    int conversao = scanner.nextInt();

                    if (conversao == 7) {
                        System.out.println("Voltando ao menu principal...");
                        continue;
                    }

                    System.out.println("Digite o valor: ");
                    double valor = scanner.nextDouble();

                    try {
                        String resultado = ConversorMoedas.converter(conversao, valor);

                        Historico.salvar(resultado);

                        System.out.println(resultado);

                    } catch (IOException | InterruptedException e) {
                        System.out.println("Erro ao converter a moeda:" + e.getMessage());
                    }

                }
                case 2 -> {
                    System.out.println("----HISTÓRICO----");
                    Historico.mostrarHistorico();
                }
                case 3 -> {
                    System.out.println("Encerrando...Até mais!");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}