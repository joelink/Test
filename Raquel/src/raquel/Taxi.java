/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raquel;

/**
 *
 * @author joelf
 */
public class Taxi extends Vehiculo{
   private String modelo;
   private int cantidad_disponible;

    public Taxi(String modelo, int cantidad_disponible, String Tipo_Vehículo, String año_vehículo, int capacidad_pasajeros) {
        super(Tipo_Vehículo, año_vehículo, capacidad_pasajeros);
        this.modelo = modelo;
        this.cantidad_disponible = cantidad_disponible;
    }

    public Taxi(String modelo, int cantidad_disponible) {
        this.modelo = modelo;
        this.cantidad_disponible = cantidad_disponible;
    }

    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

  

    @Override
    public String toString() {
        return "Taxi{" + "modelo=" + modelo + ", cantidad_disponible=" + cantidad_disponible + '}';
    }
 
    
}
