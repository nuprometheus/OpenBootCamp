package EjercicioClase8;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setNombre("Carlos Agudelo");
        persona.setTelefono("2485693");

        System.out.println("La edad de " + persona.getNombre() + " es " + persona.getEdad() + " su numero telefónico: " + persona.getTelefono());

        Persona persona2 = new Persona();
        persona2.setEdad(22);
        persona2.setNombre("Maria Betancur");
        persona2.setTelefono("3696969");

        System.out.println("La edad de " + persona2.getNombre() + " es " + persona2.getEdad() + " su numero telefónico: " + persona2.getTelefono());
    }
}
