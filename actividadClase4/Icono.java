
public class Icono {
    public static final Icono MUSICAL_NOTE = new Icono(new int[]{0xD83C, 0xDFB5});
    public static final Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});
    public static final Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});

    private final int[] internalEncoding;

    private Icono(int[] internalEncoding) {
        this.internalEncoding = internalEncoding;
    }

    public String texto() {
        return new String(internalEncoding, 0, internalEncoding.length);
    }

    @Override
    public String toString() {
        return texto();
    }
}
