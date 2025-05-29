package Decorate;

public class HabilidadDecorator implements Personaje {
    // Esta clase permite la agregación de habilidades
    // sin tener que modificar el Guerrero Básico

    protected Personaje personaje;

    public HabilidadDecorator(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String getNombre() {
        return personaje.getNombre();
    }

    @Override
    public int getNivel() {
        return personaje.getNivel();
    }

    @Override
    public void atacar() {
        personaje.atacar();
    }

    @Override
    public void mostrarEstado() {
        personaje.mostrarEstado();
    }
}
