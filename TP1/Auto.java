package TP1;

public class Auto extends Vehiculo{
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, double capacidadCargaKg, int cantidadPasajeros){
        super(patente, marca, anio, capacidadCargaKg);
        this.cantidadPasajeros = cantidadPasajeros ;
   }

   public int getCantidadPasajeros(){
        return cantidadPasajeros;
   }

   public void setCantidadPasajeros(int cantidadPasajeros) {
       if (cantidadPasajeros > 0) {
           this.cantidadPasajeros = cantidadPasajeros;
       } else {
           throw new IllegalArgumentException("Error: La cantidad de pasajeros debe ser mayor a 0.");
       }
   }

   @Override
   public String getDescripcion(){
        return super.getDescripcion() + " | Cantidad de pasajeros: " + cantidadPasajeros;
   }

}
