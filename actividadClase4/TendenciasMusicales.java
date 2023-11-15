import java.time.LocalDateTime;

public class TendenciasMusicales {
    public static void main(String[] args) {
        // Casos de prueba
        Cancion theScientist = new Cancion("The Scientist", "Coldplay", "A Rush of Blood to the Head", 2002);

        System.out.println("Estado inicial:");
        System.out.println(theScientist.mostrarDetalle());

        // Caso 1: Recién lanzada (popularidad normal)
        System.out.println("\nCaso 1:");
        System.out.println(theScientist.mostrarDetalle());

        // Caso 2: En auge
        reproducirCanciones(theScientist, 1010); // Supera las 1000 reproducciones
        System.out.println("\nCaso 2:");
        System.out.println(theScientist.mostrarDetalle());

        // Caso 3: Baja del auge por muchos dislikes
        darDislikes(theScientist, 5001); // Supera los 5000 dislikes
        System.out.println("\nCaso 3:");
        System.out.println(theScientist.mostrarDetalle());

        // Caso 4: Es tendencia
        reproducirCanciones(theScientist, 51000); // Supera las 50000 reproducciones
        darLikes(theScientist, 21000); // Supera los 20000 likes
        System.out.println("\nCaso 4:");
        System.out.println(theScientist.mostrarDetalle());

        // Caso 5: Vuelve a ser normal por no ser escuchada en las últimas horas
        theScientist.setUltimaReproduccion(LocalDateTime.now().minusHours(25));
        System.out.println("\nCaso 5:");
        System.out.println(theScientist.mostrarDetalle());
    }

    private static void reproducirCanciones(Cancion cancion, int reproducciones) {
        for (int i = 0; i < reproducciones; i++) {
            cancion.reproducir();
        }
    }

    private static void darDislikes(Cancion cancion, int dislikes) {
        for (int i = 0; i < dislikes; i++) {
            cancion.darDislike();
        }
    }

    private static void darLikes(Cancion cancion, int likes) {
        for (int i = 0; i < likes; i++) {
            cancion.darLike();
        }
    }
}
