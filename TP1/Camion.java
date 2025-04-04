package TP1;

public class Camion  extends Vehiculo{
    private boolean tieneAcoplado;
    
    public Camion(String patente, String marca, int anio, double capacidadCargaKg, boolean tieneAcoplado){
        super(patente,marca,anio,capacidadCargaKg);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean getTieneAcoplado(){
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado){
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getDescripcion(){
       String acopladoTexto;
       if(tieneAcoplado){
           acopladoTexto = "Si";
       } else {
           acopladoTexto = "No";
       }
       return super.getDescripcion() + " | Acoplado: " +acopladoTexto;
    }
}
