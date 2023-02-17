public class Main {
    public static void main(String[] args)
    {

        //Aquí declaro Variables ----------------------------------------
        int valor1 = 10;
        int valor2 = 3;
        int valor3 = 5;
        //Fin de la declaración de variables -----------------------------

        //Código del programa principal
        //------------------------------

        var sumatorioTriple = suma3(valor1, valor2, valor3);
        System.out.println("La suma de: " + valor1 + " + " + valor2 + " + " + valor3 + " = " + sumatorioTriple );

        //Instanacia a la clase Coche y posterior incremento de puertas
        Coche miCoche = new Coche();
        miCoche.IncrementaPuerta();
        miCoche.IncrementaPuerta();
        miCoche.IncrementaPuerta();
        miCoche.IncrementaPuerta();

        //Mostramos en el terminal el numero de puertas del coche
        System.out.println("El coche tiene " + miCoche.Puertas + " puertas.");



        //-----------------------------
        //Fin del espacio del código principal

    }

    // Aquí voy a escribir funciones
    //-------------------------------------------------------------------

    //Aquí añado una función que hace una suma
    public static int suma3(int a, int b, int c){
        return a + b + c;
    }

    // Fin del espacio reservado para funciones
    //---------------------------------------------------------------
}

class Coche{
    public int Puertas = 0;

    public void IncrementaPuerta(){
        this.Puertas++;

    }

}