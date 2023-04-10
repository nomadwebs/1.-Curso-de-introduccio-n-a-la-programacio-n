public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.Nombre = "Matías";
        cliente.Edad = 23;
        cliente.Telefono = "444555666";
        cliente.Credito = 100;

        Trabajador trabajador = new Trabajador();
        trabajador.Nombre = "Matías";
        trabajador.Edad = 23;
        trabajador.Telefono = "444555666";
        trabajador.Salario = 42000;


        System.out.println("Nombre: " + cliente.Nombre );
        System.out.println("Edad: " + cliente.Edad );
        System.out.println("Teléfono: " + cliente.Telefono );
        System.out.println("Crédit: " + cliente.Credito);

        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("");

        System.out.println("Nombre: " + trabajador.Nombre );
        System.out.println("Edad: " + trabajador.Edad );
        System.out.println("Teléfono: " + trabajador.Telefono );
        System.out.println("Crédit: " + trabajador.Salario);
    }
}

class Persona {
    int Edad;
    String Nombre;
    String Telefono;
}


class Cliente extends Persona {
    int Credito;

}

class Trabajador extends Persona {
    int Salario;

}