package EjerciciosClase4;

public class BuclesYCondicionales {

    public static void main(String[] args) {

    /*
        Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    */
        System.out.println("====== /// IF /// =====\n");
        int numeroIf = 4;
        if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo\n");
        } else if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + "es negativo\n");
        } else {
            System.out.println("El numero es 0\n");
        }

    /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.
    */
        System.out.println("====== /// WHILE /// =====\n");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }


    /*
        Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    */

        System.out.println("====== /// DO WHILE /// =====\n");

        int numeroDoWhile = 2;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile < 3);


    /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición
        será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute
        y deberá mostrarse por pantalla.
    */

        System.out.println("====== /// FOR /// =====\n");
        int numeroFor = 0;
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }

    /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones
        del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de
        la estación en la que está. También habrá que poner un default para cuando el valor de la variable
        no sea una estación.
    */
        System.out.println("====== /// SWITCH /// =====\n");
        String estacion = "";
        //String estacion = "PRIMAVERA";


        switch (estacion) {
            case "INVIERNO":
                System.out.println("Estacion Invierno ");
                break;
            case "VERANO":
                System.out.println("Estacion Verano ");
                break;
            case "OTOÑO":
                System.out.println("Estacion Otoño ");
                break;
            case "PRIMAVERA":
                System.out.println("Estacion Primavera ");
                break;
            default:
                System.out.println("Ninguna estacion seleccionada");

        }


    }
}
