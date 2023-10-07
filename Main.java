package java_com;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String nombre;
        String apellido;
        String direccion;
        String rut;
        int saldo;

        Scanner scanner = new Scanner();

        System.out.println("Bienvenido a Banco Javi Coins");
        System.out.println("Ingrese su nombre");
        nombre = scanner.nextLine();
        System.out.println(nombre);
        System.out.println("Ingrese su apellido");
        System.out.println("Ingrese su direccion");
        System.out.println("Ingrese su rut");
        System.out.println("Ingrese un saldo inicial para su cuenta");
	}
}