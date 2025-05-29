package Decorate;

public class GuerreroBasico implements Personaje { // Guerrero común sin habilidades especiales
    private String nombre;
    private int nivel;

    public GuerreroBasico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su espada nivel " + nivel);
    }

    @Override
    public void mostrarEstado() {
        System.out.println("Personaje: " + nombre + " | Nivel: " + nivel);
    }
}
