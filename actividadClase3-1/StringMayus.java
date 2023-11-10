package actividadClase3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringMayus {
    public static List<String> convertirListaAMayusculas(List<String> lista) {
        return lista.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("hola", "mundo", "java" , "bienvenido");
        List<String> resultado = convertirListaAMayusculas(strings);
        System.out.println(resultado);
    }
}
