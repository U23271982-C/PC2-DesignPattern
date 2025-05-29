package Decorate;

public class VelocidadExtra extends HabilidadDecorator {
    private int bonusVelocidad = 20;

    public VelocidadExtra(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " se mueve rápidamente (+ " + bonusVelocidad + "% velocidad)");
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Habilidad: Velocidad Extra (" + bonusVelocidad + "%)");
    }
}
