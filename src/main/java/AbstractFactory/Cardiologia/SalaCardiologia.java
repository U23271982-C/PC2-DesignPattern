package AbstractFactory.Cardiologia;

import AbstractFactory.Sala;

public class SalaCardiologia implements Sala {
    private int numero;
    private String tipo = "Sala de Cardiología";

    public SalaCardiologia(int numero) {
        this.numero = numero;
    }
    @Override
    public int getNumero() { return numero; }
    @Override
    public String getTipo() { return tipo; }
    @Override
    public void preparar() {
        System.out.println("Preparando la sala de cardiología #" + numero + " con equipo de ECG.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Sala #" + numero + " | Tipo: " + tipo);
    }
}
