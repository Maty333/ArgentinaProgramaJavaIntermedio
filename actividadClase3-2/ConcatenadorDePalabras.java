import java.util.List;
import java.util.stream.Collectors;

public class ConcatenadorDePalabras {

    public static String concatenarPalabras(List<String> palabras, int n) {
        return palabras.stream()
                .filter(palabra -> palabra.length() > n)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> listaDePalabras = List.of("Aguante", "messi", "viva", "el", "futbol" , "argentino");


        String resultado = concatenarPalabras(listaDePalabras, 5);

        System.out.println(resultado);
    }
}
