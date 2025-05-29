package Singleton;

public class Alumno {
    private String nombre;
    private int grado;

    public Alumno(String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    // El alumno lee el anuncio
    // metodo que abre la instancia de la clase AnuncioGeneral
    public void leerAnuncio() {
        System.out.println(nombre + " del grado " + grado + " está leyendo el anuncio:");
        AnuncioGeneral.getInstancia().mostrarMensaje();
    }
    // Sugiere un anuncio, por lo que necesita una instancia de la clase AnuncioGeneral
    public void sugerirAnuncio(String mensaje) {
        System.out.println(nombre + " ha solicitado publicar un nuevo anuncio.");
        AnuncioGeneral.getInstancia().establecerMensaje(mensaje, nombre);
    }
}
