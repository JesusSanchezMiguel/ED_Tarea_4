package Cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1 = crearCuenta();

       
         operativa_cuenta(cuenta1, 7000);
    }

    public static CCuenta crearCuenta() {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        return cuenta1;
    }
    
    public static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        try {
            cuenta.retirar(cantidad);
            System.out.println("Se retiraron " + cantidad + " euros");
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Se ingresaron " + cantidad + " euros");
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
