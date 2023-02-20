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
        while (contador > 0){
            System.out.println(contador);
            contador--;
        }

        //Para este caso, como mínimo entrará una vez en el bucle y evaluará al final para ver
        //si se sigue cumpliendo la condición
        int contador2 = 10;
        do {
            System.out.println(contador2);
            contador2--;
        } while (contador2 > 0);
    }

}