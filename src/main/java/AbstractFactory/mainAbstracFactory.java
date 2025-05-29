package AbstractFactory;

import AbstractFactory.Cardiologia.FabricaCardiologia;
import AbstractFactory.Pediatria.FabricaPediatria;

public class mainAbstracFactory {
    public static void main(String[] args) {
        // Crear una fábrica de cardiología
        // Sin necesidad de crear por singular, ni especificar su especialidad por atributos ya que Factory nos ahorra ello
        HospitalFactory fabricaCardio = new FabricaCardiologia();
        Medico cardio = fabricaCardio.crearMedico("Dr. Salazar");
        Sala salaCardio = fabricaCardio.crearSala(101);

        // Crear una fábrica de pediatría
        // Sin necesidad de crear por singular, ni especificar su especialidad por atributos ya que Factory nos ahorra ello
        HospitalFactory fabricaPedia = new FabricaPediatria();
        Medico pedia = fabricaPedia.crearMedico("Dra. Flores");
        Sala salaPedia = fabricaPedia.crearSala(202);

        // Mostrar resultados
        cardio.mostrarInfo();
        cardio.atender();
        salaCardio.mostrarInfo();
        salaCardio.preparar();

        System.out.println("-----");

        pedia.mostrarInfo();
        pedia.atender();
        salaPedia.mostrarInfo();
        salaPedia.preparar();
    }
}
