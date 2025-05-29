package Singleton;

public class AnuncioGeneral {
    private static AnuncioGeneral instancia;
    private String mensajeActual;
    private String autor;

    // Constructor privado
    private AnuncioGeneral() {
        this.mensajeActual = "Sin anuncios aún.";
        this.autor = "Sistema";
    }

    // Metodo estático para acceder a la instancia
    public static AnuncioGeneral getInstancia() {
        if (instancia == null) {
            instancia = new AnuncioGeneral();
        }
        return instancia;
    }

    // Métodos de la clase
    public void establecerMensaje(String mensaje, String autor) {
        this.mensajeActual = mensaje;
        this.autor = autor;
    }

    public void mostrarMensaje() {
        System.out.println("📢 Anuncio: " + mensajeActual + " (Publicado por: " + autor + ")");
    }
}
