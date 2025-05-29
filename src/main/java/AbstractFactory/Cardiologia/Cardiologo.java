package AbstractFactory.Cardiologia;

import AbstractFactory.Medico;

public class Cardiologo implements Medico {
    private String nombre;
    private String especialidad = "Cardiología";

    public Cardiologo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() { return nombre; }
    @Override
    public String getEspecialidad() { return especialidad; }

    @Override
    public void atender() {
        System.out.println(nombre + " está atendiendo a un paciente con problemas cardíacos.");
    }
    @Override
    public void mostrarInfo() {
        System.out.println("Médico: " + nombre + " | Especialidad: " + especialidad);
    }
}
