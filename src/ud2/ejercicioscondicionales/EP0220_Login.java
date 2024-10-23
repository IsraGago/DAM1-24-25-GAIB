package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0220_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto = "admin";
        String passwordCorrecto = "abc123.,";

        System.out.print("Introduzca su nombre de usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Introduzca su contraseña: ");
        String password = sc.nextLine();
        sc.close();

        if (usuario.equals(usuarioCorrecto) && password.equals(passwordCorrecto)){
            System.out.println("Ha iniciado sesión correctamente.");
        } else {
            System.out.println("Error de autentificación.");
        }
    }
}
