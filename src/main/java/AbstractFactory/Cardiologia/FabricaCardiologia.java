package AbstractFactory.Cardiologia;

import AbstractFactory.HospitalFactory;
import AbstractFactory.Medico;
import AbstractFactory.Sala;

public class FabricaCardiologia implements HospitalFactory {
    // Podemos crear cualquier medico y sala de la especielidad de cardiologia
    // Encapsula los métodos para crear los obejtos de medico y sala de la especialidad de cardiología
    @Override
    public Medico crearMedico(String nombre) {
        return new Cardiologo(nombre);
    }
    @Override
    public Sala crearSala(int numero) {
        return new SalaCardiologia(numero);
    }
}
