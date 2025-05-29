package Singleton;

public class mainSingleton {
    public static void main(String[] args) {
        Alumno juan = new Alumno("Juan", 4);
        Alumno maria = new Alumno("María", 5);

        // Juan lee el mensaje inicial
        juan.leerAnuncio();

        // María sugiere un nuevo anuncio
        maria.sugerirAnuncio("Recordatorio: Traer materiales para la feria científica.");

        // Juan lee el nuevo anuncio
        juan.leerAnuncio();

        // Verificar que ambos acceden a la misma instancia
        boolean mismaInstancia = AnuncioGeneral.getInstancia() == AnuncioGeneral.getInstancia();
        System.out.println("¿Juan y María acceden al mismo sistema de anuncios? " + (mismaInstancia ? "Sí" : "No"));
        // Con ello corroboramos que si esta utilizando la misma instancia
    }
}
