package EjerciciosClase3;

public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        System.out.println(":: Inicialmente mi coche tiene *** " + miCoche.getNumeroPuertas() + " *** " + " puertas");
        miCoche.agregarPuertas(1);
        System.out.println("==> Ahora, mi coche tiene " + "*** " + miCoche.getNumeroPuertas() + " *** " + " puertas\n");


        Coche miCoche2 = new Coche();
        System.out.println(":: Inicialmente mi coche tiene *** " + miCoche2.getNumeroPuertas() + " *** " + " puertas");
        miCoche2.agregarPuertas(8);
        System.out.println("==> Ahora, mi coche tiene " + "*** " + miCoche2.getNumeroPuertas() + " *** " + " puertas\n");

    }
}
