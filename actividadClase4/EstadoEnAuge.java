class EstadoEnAuge implements EstadoCancion {
    static final int REPRODUCCIONES_PARA_TENDENCIA = 50000;
    static final int LIKES_PARA_TENDENCIA = 20000;
    static final int DISLIKES_PARA_NORMAL = 5000;

    @Override
    public String mostrarDetalle(Cancion cancion) {
        return Icono.ROCKET.texto() +
                " " + cancion.getArtista() +
                " - " + cancion.getTitulo() +
                " (" + cancion.getAlbum() + " - " + cancion.getAnioAlbum() + ")";
    }

    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();

        if (cancion.getReproducciones() > REPRODUCCIONES_PARA_TENDENCIA &&
                cancion.getLikes() > LIKES_PARA_TENDENCIA) {
            cancion.cambiarEstado(new EstadoTendencia());
        }
    }

    @Override
    public void darLike(Cancion cancion) {
        cancion.incrementarLikes();
    }

    @Override
    public void darDislike(Cancion cancion) {
        cancion.incrementarDislikes();

        if (cancion.getDislikes() >= DISLIKES_PARA_NORMAL) {
            cancion.cambiarEstado(new EstadoNormal());
        }
    }
}
