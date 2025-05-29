package Decorate;

public class mainDecorate {
    public static void main(String[] args) {
        Personaje guerrero = new GuerreroBasico("Thorgar", 10);

        guerrero = new VelocidadExtra(guerrero); // Agregamos velocidad al personaje
        guerrero = new EscudoMagico(guerrero); // Agregamos escudo al personaje

        // Mostrar estado y atacar
        guerrero.mostrarEstado(); // Se muestra el estado del personaje y de las habilidades agregadas
        System.out.println("-----");
        guerrero.atacar();
    }
}
