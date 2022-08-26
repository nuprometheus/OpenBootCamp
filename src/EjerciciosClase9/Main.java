package EjerciciosClase9;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ::: EJERCICIO TEMA 9 :::\n");

        Cliente cliente = new Cliente();
        cliente.setEdad(29);
        cliente.setTelefono("2986398");
        cliente.setNombre("Paulo Arciniegas");
        cliente.setCredito(98000.36);

        System.out.println("El cliente\n " + cliente.nombre + " tiene " + cliente.getEdad() + " años\n" +
                " su numero telefónico es: " + cliente.getTelefono() + "\n" + " y cuenta con un credito de : "
                + cliente.getCredito() + "\n");
        System.out.println(" **************************************** \n");

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(48);
        trabajador.setNombre("Mario Carranza");
        trabajador.setTelefono("8963214");
        trabajador.setSalario(1060);
        System.out.println("El trabajador\n " + trabajador.nombre + " tiene " + trabajador.getEdad() + " años\n" +
                " su numero telefónico es: " + trabajador.getTelefono() + "\n" + " y cuenta con un salario de : "
                + trabajador.getSalario());


    }
}
