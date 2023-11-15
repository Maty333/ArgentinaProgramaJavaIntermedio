interface EstadoCancion {
    String mostrarDetalle(Cancion cancion);

    void reproducir(Cancion cancion);

    void darLike(Cancion cancion);

    void darDislike(Cancion cancion);

}