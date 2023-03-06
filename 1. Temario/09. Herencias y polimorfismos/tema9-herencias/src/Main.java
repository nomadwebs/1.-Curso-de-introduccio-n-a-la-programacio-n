public class Main {
    public static void main(String[] args) {

        //El concepto de herencia significa que:
        //Una clase hereda las propiedades y los métodos de otra clase
        //Se las llaman, clases madre o padres e hijas.

        //Las clases hijas pueden tener sus parámetros o métodos propios

        //Cada clase heredada hereda de su predecesor y añade las suyas propias

        //Podemos hacer que una clase hija no permita que se herede de ella.
        /*Lo hacemos mediante la instrucción "final class".*/

        //Existen varios tipos de herencias diferentes.

        //Dejaré para más adelante la herencia de abstractas.



        //En este ejemplo instanciamos la clase coche y hacemos referencia a las propiedades de su madre la clase Vehiculo
        Coche coche = new Coche();
        CocheElectrico cocheElectrico = new CocheElectrico();
        Vehiculo vehiculo = new Vehiculo();
        coche.matricula = "";
        coche.velocidadMaxima = 120;


        coche.compruebaMatricula("Hola");
        cocheElectrico.compruebaMatricula("Manola");

        //Estamos llamando a la función cocheElectrico al método comprueba matricula que está dentro de la clase Vehiculo.
        System.out.println(cocheElectrico.compruebaMatricula("XXX"));





    }
}

//Aquí tendríamos la clase madre que llamamos Vehiculo
class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public boolean compruebaMatricula(String matricula){
        if (matricula == "XXX") {
            //En el momento que la función devuelve un return la función termina
            return true;
        }
        return false;
    }

    public Vehiculo(){
        System.out.println("Estoy en el constructor de vehiculo");
    }

    public String getSonido(){
        return this.sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}

//Esta sería la clase hija "Coche" Que hereda de vehiculo
class Coche extends Vehiculo {

}

//Esta es otra clase hija de Vehiculo
class CocheElectrico extends Vehiculo {

}

//Esta es una clase final.
//Hereda de Vehiculo pero nadie más podrá heredar de ella
final class Moto extends Vehiculo{

}