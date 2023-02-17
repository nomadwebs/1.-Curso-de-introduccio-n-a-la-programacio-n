public class Main {
    public static void main(String[] args) {

    //Aquí declaro Variables ----------------------------------------
        int resultado = 0;
        int a = 44;
        int b = 10;
    //Fin de la declaración de variables ----------------------------------------


    //Aquí pongo una primera parte del código con un condicional de por medias
        System.out.println("1. Hello world!");
        System.out.println("2. Això mola molt");

        if (1 == 1) {
            System.out.println("3. Son Iguals");
        }else{
            System.out.println("3. no es possible");
        }

    //Aquí hago una llamada a la función suma
        resultado = suma(a,  b);

        //Y ahora imprimio el resultado de la función
        System.out.printf("El resultado de sumar a+b = ");
        System.out.println(resultado);


    //LLamo a la función mixta que mostrará (desde la función el nombre y la edad en meses de un niño)
    mixta(10, "Unai");


    //Esta esd una declaración dinamica, Vmultiplica cogerá el valor que mejor le convenga
    var Vmultiplica = multiplica(5, 5);
    System.out.println(Vmultiplica);


    //Aquí voy a hacer una instancia que llama a la classe Potato
    Potato miPotato = new Potato(); //El new me indica a mi que he creado un objeto que tiene propiedades
    //Estas propiedades están dentro de la clase potato

    //Ahora le vamos a quitar brazos al Potato

    miPotato.QuitarBrazo();
    miPotato.QuitarBrazo();
    miPotato.QuitarBrazo();

    System.out.printf("El señor potato ahora tiene el numero de brazos = ");
    System.out.println(miPotato.brazos);

    }





    // Aquí voy a escribir funciones
    //-------------------------------------------------------------------

    //Aquí añado una función que hace una suma
    public static int suma(int a, int b){
        return a + b;
    }

    //Esta función hace una multiplicación
    public static int multiplica(int a, int b){
        return a * b;
    }

    //A la siguiente función le entramos un entero, y un string.
    //No devuelve nada y imprime desde dentro
    public static void mixta(int a, String nombre){
        System.out.printf("El niño pequeño se llama: ");
        System.out.println(nombre);

        System.out.printf("Y tiene: ");
        System.out.println (a);
        System.out.printf(" meses ");
    }

    // Fin del espacio reservado para funciones
    //---------------------------------------------------------------

}

// Y aquí debajo (fuera de la clase Main) reservo un espacio para las clases
//--------------------------------------------------------------------------

class Potato{
    public int brazos = 0; //Brazos es un objeto dentro de la clase Potato

    public void QuitarBrazo(){
        this.brazos--;
    }
}

//--------------------------------------------------------------------------
//Fin del espacio reservado para las clases