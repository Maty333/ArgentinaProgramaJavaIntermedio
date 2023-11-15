class EstadoNormal implements EstadoCancion {
    static final int REPRODUCCIONES_PARA_AUGE = 1000;

    @Override
    public String mostrarDetalle(Cancion cancion) {
        return Icono.MUSICAL_NOTE.texto() +
                " " + cancion.getArtista() +
                " - " + cancion.getAlbum() +
                " - " + cancion.getTitulo();
    }

    @Override
    public void reproducir(Cancion cancion) {
        cancion.incrementarReproducciones();

        if (cancion.getReproducciones() > REPRODUCCIONES_PARA_AUGE) {
            cancion.cambiarEstado(new EstadoEnAuge());
        }
    }

    @Override
    public void darLike(Cancion cancion) {
        cancion.incrementarLikes();
    }

    @Override
    public void darDislike(Cancion cancion) {
        cancion.incrementarDislikes();

        if (cancion.getDislikes() >= EstadoEnAuge.DISLIKES_PARA_NORMAL) {
            cancion.cambiarEstado(new EstadoEnAuge());
        }
    }
}
