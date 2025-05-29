package AbstractFactory;

public interface HospitalFactory {
    // Con esta clase podemos crear cualquier tipo de sala y medicos
    Medico crearMedico(String nombre);
    Sala crearSala(int numero);
}
