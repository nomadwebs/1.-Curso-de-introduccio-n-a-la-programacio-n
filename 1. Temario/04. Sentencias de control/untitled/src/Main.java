/*
Introducción a la programación
------------------------------

Módulo 4. Las sentencias de control.

1. Condicionales
2. Bucles While y Do While
3. Bucles For
4. Switch Case
*/

public class Main {
    public static void main(String[] args) {

        //1. Condicionales
        //El caso por excelencia es el IF
        int i = 17;

        if (i < 15) {
            System.out.println("El valor es menor que 15");
        } else if (i > 15) {
            System.out.println("El valor es mayor que 15");
        } else {
            System.out.println("Son iguales");
        }

        //2. Bucles While y Do While
        // Estos bucles son similares entre si, aunque se diferencian por que uno evalua la condicion
        // Antes de entrar al loop, y el otro la evalua despúes.

        //Este bucle avalua antes de entrar en el bucle. En caso de no cumplir la condición ya no entra.
        int contador = 10;
        System.out.println("Aquí mostramos el WHILE");
        while (contador > 0){
            System.out.println(contador);
            contador--;
        }

        //Para este caso, como mínimo entrará una vez en el bucle y evaluará al final para ver
        //si se sigue cumpliendo la condición
        int contador2 = 10;
        System.out.println("Aquí mostramos el DO WHILE");
        do {
            System.out.println(contador2);
            contador2--;
        } while (contador2 > 0);


        //3. El siguiente ejemplo es para el bucle FOR, que es un híbrido entre los dos anteriores
        //Y el que se usará en la mayoría de ocasiones
        // Los utilizaremos muchas veces para recorrer arrays
        System.out.println("Aquí mostramos el FOR");
        for (i=0; i<=10; i++){
            System.out.println(i);
        }

        //Los bloques de inicio y final del for son opcionales. Pero queda un poco feote
        int temperatura = 15;
        for (; temperatura != 15;){
            System.out.println(temperatura);
        }


        //La mayoría de las veces utilizaremos los fors para recorrer arrays
        int valores[] = new int[5];  //Aquí tenemos una declaración de un array
        int valores2[] = {10, 20, 30, 40, 50}; //También lo podemos crear e inicialiciar directamente así.


        for (int y = 0; y < valores2.length; y++){
            System.out.println(valores2[y]);
        }

        /*
        int infinita = 0;
        for (;;){   //Bucle infinito. Esto dará vueltas hasta que algo pete
            System.out.println(infinita);
            infinita++;
        }
        */



        //4. Switch Case --> Teoria de los interruptores
        // Es super importante utilizar el Break para frenar la elección en la que nos hemos parado
        var Estacion = "Verano";

        switch (Estacion){
            case "Verano":
                System.out.println("Es verano");
                break; //El break es para salir de la condición.
                       //Sin el Break el programa continuará evaluando todos los casos
            case "Invierno":
                System.out.println("Es Invierno y hace frío");
                break;
            default:
                System.out.println("Otra estación");
        }

        //Esto también se podría mostrar de la siguiente manera

        var hoy_es = "Martes";

        switch (hoy_es){
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("Hoy es laborable");
                break;
            case "Sábado":
            case "Domingo":
                System.out.println("Hoy NO es laborable");
                break;

        }

    }

}