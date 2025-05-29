package AbstractFactory.Pediatria;

import AbstractFactory.HospitalFactory;
import AbstractFactory.Medico;
import AbstractFactory.Sala;

public class FabricaPediatria implements HospitalFactory {
    // Con esta clase nos evitamos de crear por singular el medico y la sala de la especialización de Pediatría
    @Override
    public Medico crearMedico(String nombre) {
        return new Pediatra(nombre);
    }

    @Override
    public Sala crearSala(int numero) {
        return new SalaPediatria(numero);
    }
}
