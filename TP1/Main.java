package TP1;

public class Main {
    public static void main (String[] args){
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 2000);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Fiat", 1994, 1000);
        Vehiculo vehiculo3 = new Vehiculo("WYZ789", "Ford" ,2005, 1050);
        System.out.println("\n📌 Lista de Vehículos Registrados:");
        System.out.println("-----------------------------------");
        VehiculoPrinter.imprimirVehiculo(vehiculo1);
        VehiculoPrinter.imprimirVehiculo(vehiculo2);
        VehiculoPrinter.imprimirVehiculo(vehiculo3);
    }
}
