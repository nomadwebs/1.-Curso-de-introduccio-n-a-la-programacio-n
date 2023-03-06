public class Main {

    //El polimorfismo se utiliza para crear una misma función en una clase padre y hijo.

    //Si yo invoco un método de una clase lo ejecutará.

    //Pero si no existe se ejecutará el de su padre.

    //Puede ser útil si tenemos diferentes parametros y en función de la entrada ejecutaremos una cosa u otra.



    /*
    En el siguiente ejemplo tenemos la misma función implementada
    en dos clases, una padre y una hija.

    Al invocarla, ejecuta el método de la clase hijo "Soy un coche"
    Pero si no existiera, ejecutaría la función de la clase padre. "Hola"

     */

    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.diHola();

        //En función de como le llamemos ejecutará una cosa u otra
        coche.sumaNumeros(3, 8);
        coche.sumaNumeros( (float) 5, (float) 6.7);
        coche.sumaNumeros(4.4, 12.5);

    }
}

class Vehiculo{
    public void diHola(){
        System.out.println("Hola!! ");
    }


    //Las tres funciones que vienen a continuación es un claro ejemplo de polimorfismo
    //Todas se llaman iguales, pero aceptan parámetros diferentes.
    //En función del parámetro que le pasemos se ejecutará una u otra.

    public int sumaNumeros(int a, int b){
        System.out.println("sumaNumeros INT");
        return a + b;
    }

    public float sumaNumeros(float a, float b){
        System.out.println("sumaNumeros FLOAT");
        return  a+b * (float) 9.0;
    }

    public void sumaNumeros(double a, double b){
        System.out.println("sumaNumeros DOUBLE");
       System.out.println("El resultado es: " + (a+b));
    }

}

class Coche extends Vehiculo {
    public void diHola(){
        System.out.println("Soy un coche");
    }
}