package TP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        List<Vehiculo> vehiculo = new ArrayList<>();
        vehiculo.add(new Vehiculo("ABC123", "Toyota", 2020, 2000));
        vehiculo.add(new Vehiculo("DEF456", "Fiat", 1994, 1000));
        vehiculo.add(new Vehiculo("WYZ789", "Ford" ,2005, 1050));
        vehiculo.add(new Camion("GHI789", "Volvo", 2010, 8000, true));
        vehiculo.add(new Camion("ERT767", "Audi", 2015, 7500, false));
        vehiculo.add(new Auto("QWE", "Honda", 2004, 5000, 4));

        System.out.println("\n📌 Lista de Vehículos Registrados:");
        System.out.println("-----------------------------------");
        for (Vehiculo v: vehiculo){
            VehiculoPrinter.imprimirVehiculo(v);
        }
    }
}
