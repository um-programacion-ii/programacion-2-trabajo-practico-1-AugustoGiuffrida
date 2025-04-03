package TP1;

public class VehiculoPrinter {
    public static void imprimirVehiculo(Vehiculo vehiculo){
        System.out.println("Vehículo: " +vehiculo.getMarca()+
                           " | Patente: " +vehiculo.getPatente()+
                           " | Año: " +vehiculo.getAnio()+
                            "| Capacidad de carga: " +vehiculo.getCapacidadCargaKg()+ " Kg");
    }
}
