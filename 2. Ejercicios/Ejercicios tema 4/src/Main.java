public class Main {
    public static void main(String[] args) {

        //1. Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        int numeroIf = 7;

        if (numeroIf > 0){
            System.out.println("Es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Es negativo");
        }else {
            System.out.println("Es 0");
        }
        System.out.println("-------------------------------------");

        //2. Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
        //
        //Incrementar el valor de la variable en uno cada vez que se ejecute.
        //
        //Mostrarlo por pantalla cada vez que se ejecute.

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("-------------------------------------");


        //3. Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroWhile2 = 0;

        do {
            System.out.println(numeroWhile2);
            numeroWhile2 = numeroWhile2 + 3;
        } while (numeroWhile2 < 3);
        System.out.println("-------------------------------------");

        //4. Para el bucle For, crea una variable numeroFor, esta variable tendrá
        // como valor 0 y su condición será que la variable sea igual o menor que 3,
        // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

        int numeroFor = 0;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("-------------------------------------");

        //5. Por último, para el Switch, deberás crear la variable estacion, y distintos case
        // para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
        //se deberá mandar un mensaje por consola informando de la estación en la que está.
        // También habrá que poner un default para cuando el valor de la variable no sea una estación.

        var estacion = "Otoñ7o";

        switch (estacion){
            case "Verano":
                System.out.println("Es verano y la gente se pone el bañador");
                break; //El break es para salir de la condición.
            //Sin el Break el programa continuará evaluando todos los casos
            case "Invierno":
                System.out.println("Es Invierno y hace frío");
                break;
            case "Otoño":
                System.out.println("Es otoño y caen las hojas");
                break;
            case "Primavera":
                System.out.println("Es primavera y la sangre altera");
                break;
            default:
                System.out.println("El valor introducido no es una estación");
        }
        System.out.println("-------------------------------------");
        System.out.println("Fin del ejercicio 4");



    }
}