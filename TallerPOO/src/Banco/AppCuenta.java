package Banco;

import java.util.Scanner;

/**
 *
 * @author bolillo
 */
public class AppCuenta {
    
    public static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        double montoDeposito;
        
        Cuenta cuenta1 = new Cuenta(50);
        Cuenta cuenta2 = new Cuenta(-7.53);
        
        System.out.println("Sueldo cuenta 1 " + cuenta1.getSaldo());
        System.out.println("Sueldo cuenta 2 " + cuenta2.getSaldo());
       
        System.out.println("Escriba el monto a depositar en la cuenta 1: ");
        montoDeposito = in.nextDouble();
        
        cuenta1.abonar(montoDeposito);
        
        System.out.println("El nuevo de la cuenta 1 es: " + cuenta1.getSaldo());        
        System.out.println("Escriba el monto a depositar en la cuenta 2: ");
        montoDeposito = in.nextDouble();
        
        cuenta2.abonar(montoDeposito);
        
        System.out.println("El nuevo de la cuenta 2 es: " + cuenta2.getSaldo());        
        System.out.println("/nLos saldos son: ");
        System.out.println("Cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Cuenta 2: " + cuenta2.getSaldo());
        
        
    }
}
