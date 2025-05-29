package AbstractFactory.Pediatria;

import AbstractFactory.Medico;

public class Pediatra implements Medico {
    private String nombre;
    private String especialidad = "Pediatría";

    public Pediatra(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String getNombre() { return nombre; }
    @Override
    public String getEspecialidad() { return especialidad; }
    @Override
    public void atender() {
        System.out.println(nombre + " está revisando a un niño con fiebre.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Médico: " + nombre + " | Especialidad: " + especialidad);
    }
}
