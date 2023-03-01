public class Main {
    public static void main(String[] args) {

        // Vídeo del tema 8: Privacidad, abstracción y encapsulación
        // https://campus.open-bootcamp.com/cursos/3/leccion/32

        /*
        00:00 - Introducción

        00:54 - Propiedad privada y publica

            Las propiedades public y privada se refieren a las propiedades que hay dentro de una clase
            ver el ejemplo en la classe Vehiculo de este ejemplo

        03:43 - Cuando se define publico o privado

        06:41 - Encapsulación

            - La encapsulación consiste en jugar entre variables privadas y publicas para poder acceder desde otras clases
            - En realidad lo que hacemos es encapsular las propiedades para que sean accesibles únicamente con funciones (getter y setter)


        26:24 - Usos de encapsulación

            - En ocasiones más complejos vamos a necesitar (Como los programas multi-hilo)
            - Puede que necesitemos hacer operaciones dentro de las clases y que fuera solo se pueda acceder mediante las funciones getter y setter
            - La progrmación multi-hilo consiste en hacer programas que hacen varias cosas a la vez


        36:59 - Abstracción

            - Consiste en implementar parte de de mi clase, y dejar la otra parte que haga "lo que quiera"
            - Nos dan una serie de funciones programadas y tenemos que programar el resto
                - Las funciones getter y setter las tendremos hechas
            - NO SE PUEDEN USAR DIRECTAMENTE: Hay que heredarlas

        37:13 - ejemplo de clase abstracta
        */

        Vehiculo coche = new Vehiculo();
        Vehiculo moto = new Vehiculo();
        //A la propiedad tipo podemos acceder porque esta propiedad es pública dentro de la clase Vehiculo
        //Si dentro de la clase vehiculo encontramos esto: "Private String tipo;" no podríamos acceder

        /*
        Con la encapsulación ce la propiedad tipo ahora no podemos acceder como lo hacíamos aquí.
        vehiculo.tipo = "Coche";
        System.out.println(vehiculo.tipo);
        */

        //*** LA FORMA DE ACCEDER A LA PROPIEDAD DE LA CLASE VEHÍCULO ES HACER LO SIGUIENTE ***

        //Aquí le pasamos el valor coche a la propiedad tipo de la clase
        coche.setTipo("Coupe");
        coche.setVelocidadMaxima(120);
        coche.setRapido(true);
        moto.setTipo("Scooter");
        moto.setVelocidadMaxima(60);
        moto.setRapido(false);

        //Y Aquí recogemos e imprimimos su valor
        String tipo = coche.getTipo();
        System.out.println(tipo + " " + coche.getVelocidadMaxima() + " " + coche.isRapido());

        System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima() + " " + moto.isRapido());

    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private boolean estado;     //Esta variable únicamente la utilizaremos dentro de la clase.
                                //Y en este caso no necesita funciones getter ni setter.

    private boolean rapido;     //En las varibales boolean segun la convención java
                                //La nomenclatura para el getter el diferente
                                //Ver el ejemplo más abajo.

    //En este punto vamos a encapsular la propiedad tipo de la clase mediante una función setter
    //En java se identifica por setNombre_de_la_propiedad_capitalizada.
    //También utilizamos el this para referirnos a la propiedad dentro de la propia clase.
    //Al no devolver nada utilizamos el void
    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    //Adicionalmente tendremos que añadir la función getter.
    //Esta función a diferencia de la anterior no pone el valor, sino que lo devuelve
    //No tiene parametros

    public String getTipo(){
        return this.tipo;
    }

    //Funciones getter y setter para la velocidadmaxima
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    //Funciones getter y setter para la variable boleana rápido
    public void setRapido(boolean rapido){
        this.rapido = rapido;
    }

    public boolean isRapido(){
        return this.rapido;
    }
}


//Ahora voy a crear una clase ABSTRACTA cómo una copia de la anterior (pero en abstracta)
abstract class Vehiculo2 {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    private boolean rapido;
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }


    //Las clases abstractas no tienen cuerpo (Se tienen que programar a mano)
    abstract public void setSonido(String sonido);
    abstract public String getSonido();
}