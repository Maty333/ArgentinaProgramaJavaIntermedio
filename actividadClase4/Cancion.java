import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int anioAlbum;
    private LocalDateTime ultimaReproduccion;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private EstadoCancion estado;

    static final int REPRODUCCIONES_PARA_TENDENCIA = 50000;
    static final int LIKES_PARA_TENDENCIA = 20000;

    public Cancion(String titulo, String artista, String album, int anioAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.anioAlbum = anioAlbum;
        this.ultimaReproduccion = LocalDateTime.now();
        this.reproducciones = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.estado = new EstadoNormal();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public EstadoCancion getEstado() {
        return estado;
    }

    public int getAnioAlbum() {
        return anioAlbum;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public void cambiarEstado(EstadoCancion estado) {
        this.estado = estado;
    }

    public void reproducir() {
        estado.reproducir(this);
        ultimaReproduccion = LocalDateTime.now();
    }

    public void darLike() {
        estado.darLike(this);
    }

    public void darDislike() {
        estado.darDislike(this);
    }

    public String mostrarDetalle() {
        return estado.mostrarDetalle(this);
    }

    public void incrementarReproducciones() {
        reproducciones++;
    }

    public void incrementarLikes() {
        likes++;
    }

    public void incrementarDislikes() {
        dislikes++;
    }

    public ChronoLocalDateTime<?> getUltimaReproduccion() {

        return ultimaReproduccion;
    }
}