import java.time.LocalDateTime;

class EstadoTendencia implements EstadoCancion {
    private static final int HORAS_SIN_REPRODUCCION_PARA_NORMAL = 24;

    @Override
    public String mostrarDetalle(Cancion cancion) {
        return Icono.FIRE.texto() +
                " " + cancion.getTitulo() +
                " - " + cancion.getArtista() +
                " (" + cancion.getAlbum() + " - " + cancion.getAnioAlbum() + ")";
    }

    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();

        if (cancion.getReproducciones() > EstadoEnAuge.REPRODUCCIONES_PARA_TENDENCIA &&
                cancion.getLikes() > EstadoEnAuge.LIKES_PARA_TENDENCIA) {
            cancion.cambiarEstado(new EstadoTendencia());
        } else if (LocalDateTime.now().minusHours(HORAS_SIN_REPRODUCCION_PARA_NORMAL).isAfter(cancion.getUltimaReproduccion())) {
            cancion.cambiarEstado(new EstadoNormal());
        }
    }

    @Override
    public void darLike(Cancion cancion) {
        cancion.incrementarLikes();
    }

    @Override
    public void darDislike(Cancion cancion) {
        cancion.incrementarDislikes();
    }
}
