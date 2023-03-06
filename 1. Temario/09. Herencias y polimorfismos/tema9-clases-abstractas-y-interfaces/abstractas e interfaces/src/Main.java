public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.setSonido("BRRRRR");
        System.out.println(coche.getSonido());


        Moto moto = new Moto();
        moto.setSonido("nyyyyyyyy");
        System.out.println(moto.getSonido());


    }
}

abstract class Vehiculo {
    int velocidadMaxima;
    String matricula;
    String sonido;

    //Constructor de la clase
    public Vehiculo(){
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    //Las funciones abstractas no tienen cuerpo (porque no sabemos que van a hacer)
    abstract public String getSonido();
    /*public String getSonido(){
        return this.sonido;
    }*/
    abstract public void setSonido(String sonido);
    /*public void setSonido(String sonido){
        this.sonido = sonido;
    }*/
}

class Coche extends Vehiculo{
    public String getSonido(){
        //return this.sonido;
        return "Soy un supersonido de coche: " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }

}

class Moto extends Vehiculo{
    public String getSonido(){
        return "Soy un ruidito de moto: " + this.sonido;

        //return this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}