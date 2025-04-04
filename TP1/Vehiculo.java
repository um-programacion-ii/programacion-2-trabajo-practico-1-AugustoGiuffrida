package TP1;

import java.time.LocalDate;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    //Constructor
    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg){
        setPatente(patente);
        setMarca(marca);
        setAnio(anio);
        setCapacidadCargaKg(capacidadCargaKg);
    }

    //getters
    public String getPatente(){
        return patente;
    }

    public String getMarca(){
        return marca;
    }

    public int getAnio(){
        return  anio;
    }

    public double getCapacidadCargaKg(){
        return capacidadCargaKg;
    }

    //setters
    public void setPatente(String patente){
        if (patente != null && !patente.trim().isEmpty()){
        this.patente = patente;
        } else {
            throw new IllegalArgumentException("Error: La patente no puede ser nula o vacia");
        }
    }

    public void setMarca(String marca){
        if (marca != null && !marca.trim().isEmpty()){
            this.marca = marca;
        } else {
            throw new IllegalArgumentException("Error: La marca no puede ser nula o vacía.");
        }
    }

    public void setAnio(int anio){
        int anioActual = LocalDate.now().getYear();
        if (anio>1900 && anio<= anioActual){
            this.anio = anio;
        } else{
            throw new IllegalArgumentException("Error: El año debe estar entre 1900 y "+anioActual+".");
        }
    }

    public void setCapacidadCargaKg( double capacidadCargaKg){
        if (capacidadCargaKg > 0){
            this.capacidadCargaKg = capacidadCargaKg;
        }else {
            throw new IllegalArgumentException("Error: La carga debe ser un valor positivo");
        }
    }

    public String getDescripcion() {
        return "Vehículo: " + marca +
                " | Patente: " + patente +
                " | Año: " + anio +
                " | Capacidad de carga: " + capacidadCargaKg + " Kg";
    }
}
