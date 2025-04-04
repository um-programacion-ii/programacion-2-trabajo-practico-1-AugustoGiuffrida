package TP1;

import java.util.List;
import java.util.Scanner;

public class VehiculoFinder {

    public static void buscarVehiculo(List<Vehiculo> vehiculo) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("¿Desea buscar un vehículo por su patente?(Si o No) ");
            String respuesta = scanner.nextLine().toLowerCase();

            switch (respuesta){
                case "si":
                     System.out.print("Ingrese la patente que quiere buscar: ");
                     String patente = scanner.nextLine();
                     boolean encontrado = false;
                     for (Vehiculo v : vehiculo) {
                         if (v.getPatente().equalsIgnoreCase(patente)) {
                            encontrado = true;
                             VehiculoPrinter.imprimirVehiculo(v);
                         }
                     } if (!encontrado) {
                         System.out.println("No hay coincidencias");
                     }
                     break;

                case "no":
                    System.out.println("Saliendo de la búsqueda...");
                    return;

                default:
                    System.out.println("Respuesta inválida. Escriba 'si' o 'no'.");
                    break;
            }
        }
    }
}

///         SOLUCION "PYTHON"
///        while (seguirBuscando) {
///             System.out.print("¿Desea buscar un vehículo por su patente?(Si o No) ");
///             String respuesta = scanner.nextLine();
///
///             if (respuesta.equalsIgnoreCase("si")) {
///                 System.out.print("Ingrese la patente que quiere buscar: ");
///                 String patente = scanner.nextLine();
///                 boolean encontrado = false;
///                 for (Vehiculo v : vehiculo) {
///                     if (v.getPatente().equalsIgnoreCase(patente)) {
///                         encontrado = true;
///                         VehiculoPrinter.imprimirVehiculo(v);
///                     }
///                 }
///                 if (!encontrado) {
///                     System.out.println("No hay coincidencias");
///                 }
///             } else if (respuesta.equalsIgnoreCase("no")) {
///                 seguirBuscando = false;
///             }
///         }