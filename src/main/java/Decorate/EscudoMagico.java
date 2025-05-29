package Decorate;

public class EscudoMagico extends HabilidadDecorator {
    private int defensaExtra = 50;

    public EscudoMagico(Personaje personaje) {
        super(personaje);
    }

    @Override
    public void atacar() {
        super.atacar();
        //System.out.println(String.format("%s está protegido por un escudo mágico (%d defensa)", getNombre(), defensaExtra));
        System.out.println(getNombre() + " está protegido por un escudo mágico (+ " + defensaExtra + " defensa)");
    }

    @Override
    public void mostrarEstado() {
        super.mostrarEstado();
        System.out.println("Habilidad: Escudo Mágico (" + defensaExtra + " defensa)");
    }
}
