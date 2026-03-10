import java.util.ArrayList;
import java.util.List;

public class Historico {

        private static  List<String> registros = new ArrayList<>();

        public static void salvar(String texto) {
            registros.add(texto);
        }

        public static void mostrarHistorico() {
            if (registros.isEmpty()) {
                System.out.println("Nenhum histórico de conversão encontrado.");
                return;
            }

            for (String item : registros) {
                System.out.println(item);
            }
        }
    }



