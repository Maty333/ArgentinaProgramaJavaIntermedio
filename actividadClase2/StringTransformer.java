package actividadClase2;

import java.util.List;
import java.util.stream.Collectors;

public class StringTransformer {
    public List<String> transformStrings(List<String> strings1, Transformador1 transformador) {
        return strings1.stream()
                .map(transformador::transformar)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        StringTransformer transformer = new StringTransformer();


        List<String> listaDeStrings = List.of("Hola", "Mundo", "Practicando", "Java", "Expresiones", "Lambda");


        List<String> listaTransformada = transformer.transformStrings(listaDeStrings, s -> s.toUpperCase());

        listaTransformada.forEach(System.out::println);
    }
}
