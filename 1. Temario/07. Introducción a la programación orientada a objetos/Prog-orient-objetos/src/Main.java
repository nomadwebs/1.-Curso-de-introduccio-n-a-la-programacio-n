public class Main {
    public static void main(String[] args) {

        /*
        Los objetos son elementos que pretenden representar entes de la vida real.

        Los objetos pueden ser elementos que a su vez tienen métodos.

        El objeto coche por ejemplo tiene:
        - Elemento puertas
        - Elemento acelerador
        - Elemento maletero
        -...

        Pero también dispone de métodos:
        - Abrir puerta
        - Cerrar maletero
        - Abrir maletero
        - ...

        Los objetos se definen en la mayoria de lenguajes de programación con clases

         */

        //Ahora para crear un nuevo objeto tendremos que instanciar a la clase coche de la siguiente manera:
        //A la hora de instanciar una clase el propio JAVA crea un constructor, pero lo podemos preparar también a medida.
        //Utilizaremos principalmente los constructores para incializar variables

        Coche coche1 = new Coche(); //LLama al constructor sin parámetros
        Coche coche2 = new Coche(3, 135); //LLama al constructor CON parámetros
        Coche coche3 = new Coche(); //LLama al constructor sin parámetros


        //Muestro los valores iniciales del coche
        System.out.println("--------------------");
        System.out.println("El coche 1 tiene " + coche1.numeroDePuertas + " puertas, y una velocidad máxima de: " + coche1.velocidadMaxima);
        System.out.println("El coche 2 tiene " + coche2.numeroDePuertas + " puertas, y una velocidad máxima de: " + coche2.velocidadMaxima);
        System.out.println("El coche 3 tiene " + coche3.numeroDePuertas + " puertas, y una velocidad máxima de: " + coche3.velocidadMaxima);


        //Ahora que hemos creado los coches yo puedo hacer cosas con ellos:
        System.out.println("--------------------");
        System.out.println("La velocidad del coche 1 es:" + coche1.velocidadActual);
        System.out.println("La velocidad del coche 2 es:" + coche1.velocidadActual);
        System.out.println("La velocidad del coche 3 es:" + coche1.velocidadActual);

        //A continuación voy a hacer acelerar a los coches:
        coche1.acelerar();
        coche1.acelerar();
        coche1.acelerar();

        for (int i=0; i<10; i++) {
            coche2.acelerar();
        }
        coche2.frenar();

        //Y por último muestro sus velocidades despues de la operación
        System.out.println("--------------------");
        System.out.println("La velocidad del coche 1 es:" + coche1.velocidadActual);
        System.out.println("La velocidad del coche 2 es:" + coche2.velocidadActual);
        System.out.println("La velocidad del coche 3 es:" + coche3.velocidadActual);


    }
}

//A modo ejemplo aquí voy a crear una clase
class Coche{

    //A su vez la clase coche va a tener propiedades:
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    //Ahora voy a crear dos constructores para la clase. El primero sin parámetros y el segundo con parámetros:
    //El primero de ellos se ejecutará si llamo a la clase sin parámetros.
    //El segundo se ejecutará cuando llame a la clase con parámetros.

    //Este es el constructor SIN PARAMETROS
    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor SIN PARAMETROS");
    }

    /*
    La opción de constructor que se muestra aquí, es correcta, pero es mejor y de buena práctica hacerlo como muestra el siguiente.
    public Coche(int puertas, int velocidad){
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }
    */

    //En este caso estamos usando el mismo nombre al parámetro.
    //Y para no confundirnos usamos al this.numeroDePuertas (para hacer referencia al parametro de esa clase)
    //Lo que se ve a continuación es exáctamente lo mismo que el código comentado anterior.
    public Coche (int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }

    //Además de las propiedades la clase también va a tener *** MÉTODOS ***
    public void acelerar(){
        velocidadActual += 15;
    }
    public void frenar(){
        velocidadActual -= 15;
    }

}