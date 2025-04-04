package TP1;

public class Main {
    public static void main (String[] args){
        Vehiculo vehiculo1 = new Vehiculo("ABC123", "Toyota", 2020, 2000);
        Vehiculo vehiculo2 = new Vehiculo("DEF456", "Fiat", 1994, 1000);
        Vehiculo vehiculo3 = new Vehiculo("WYZ789", "Ford" ,2005, 1050);
        Camion camion1 = new Camion("GHI789", "Volvo", 2010, 8000, true);
        Camion camion2 = new Camion("ERT767", "Audi", 2015, 7500, false);
        Auto auto1 = new Auto("QWE", "Honda", 2004, 5000, 4);

        System.out.println("\n📌 Lista de Vehículos Registrados:");
        System.out.println("-----------------------------------");
        VehiculoPrinter.imprimirVehiculo(vehiculo1);
        VehiculoPrinter.imprimirVehiculo(vehiculo2);
        VehiculoPrinter.imprimirVehiculo(vehiculo3);
        VehiculoPrinter.imprimirVehiculo(camion1);
        VehiculoPrinter.imprimirVehiculo(camion2);
        VehiculoPrinter.imprimirVehiculo(auto1);
    }
}
