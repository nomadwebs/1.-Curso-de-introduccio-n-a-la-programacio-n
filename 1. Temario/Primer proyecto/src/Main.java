public class Main {
    public static void main(String[] args) {

        //Aquí declaro Variables
            int resultado = 0;
            int a = 44;
            int b = 10;
        //Fin de la declaración de variables


        //Aquí pongo una primera parte del código con un condicional de por medias
            System.out.println("1. Hello world!");
            System.out.println("2. Això mola molt");

            if (1 == 1) {
                System.out.println("3. Son Iguals");
            }else{
                System.out.println("3. no es possible");
            }


        //Aquí hago una llamada a una función
            resultado = suma(a,  b);
            System.out.printf("El resultado de sumar a+b = ");

            //Y ahora imprimio el resultado de la función
            System.out.println(resultado);
    }

    //Aquí añado una función
        public static int suma(int a, int b){
            return a + b;
        }


}