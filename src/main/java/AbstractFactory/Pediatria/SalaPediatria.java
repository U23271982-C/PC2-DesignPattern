package AbstractFactory.Pediatria;

import AbstractFactory.Sala;

public class SalaPediatria implements Sala {
    private int numero;
    private String tipo = "Sala de Pediatría";

    public SalaPediatria(int numero) {
        this.numero = numero;
    }
    @Override
    public int getNumero() { return numero; }
    @Override
    public String getTipo() { return tipo; }
    @Override
    public void preparar() {
        System.out.println("Preparando la sala de pediatría #" + numero + " con juguetes y decoración infantil.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Sala #" + numero + " | Tipo: " + tipo);
    }
}
