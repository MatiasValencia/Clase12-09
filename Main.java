import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String nombre;
        String apellido;
        String direccion;
        String rut;
        int saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a Banco Javi Coins");
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = scanner.nextLine();
        System.out.println("Ingrese su direccion");
        direccion = scanner.nextLine();
        System.out.println("Ingrese su rut");
        rut = scanner.nextLine();
        System.out.println("Ingrese un saldo inicial para su cuenta");
        saldo = scanner.nextInt();

        CuentaBancaria cliente = new CuentaBancaria(nombre, apellido, direccion, rut, saldo);

        System.out.println("Felicitaciones, "+cliente.getNombre()+" "+cliente.getApellido()+", se ha creado la cuenta con exito. Su saldo inicial es $"+cliente.getSaldo());

        //Menu de opciones
        int opcionMenu;
        do {
            System.out.println("Bienvenido,"+cliente.getNombre()+". ¿Qué desea hacer?");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese el monto a depositar: ");
                    int montoDeposito = scanner.nextInt();
                    cliente.deposito(montoDeposito);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar: ");
                    int montoRetiro = scanner.nextInt();
                    cliente.retiro(montoRetiro);
                    break;
                case 3:
                    cliente.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Gracias por visitarnos. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor seleccione una opcion valida.");
            }      
        } while (opcionMenu != 4);

        scanner.close();
    }
}
