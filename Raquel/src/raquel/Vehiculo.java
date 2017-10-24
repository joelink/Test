/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raquel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joelf
 */

public class Vehiculo {

    private String Tipo_Vehículo;
    private String año_vehículo;
    private int capacidad_pasajeros;
    private List<Bus> listaBus = new ArrayList<Bus>();
    private List<Taxi> listaTaxi = new ArrayList<Taxi>();

    public Vehiculo(String Tipo_Vehículo, String año_vehículo, int capacidad_pasajeros) {
        this.Tipo_Vehículo = Tipo_Vehículo;
        this.año_vehículo = año_vehículo;
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public Vehiculo() {

    }

    public String getTipo_Vehículo() {
        return Tipo_Vehículo;
    }

    public void setTipo_Vehículo(String Tipo_Vehículo) {
        this.Tipo_Vehículo = Tipo_Vehículo;
    }

    public String getAño_vehículo() {
        return año_vehículo;
    }

    public void setAño_vehículo(String año_vehículo) {
        this.año_vehículo = año_vehículo;
    }

    public int getCapacidad_pasajeros() {
        return capacidad_pasajeros;
    }

    public void setCapacidad_pasajeros(int capacidad_pasajeros) {
        this.capacidad_pasajeros = capacidad_pasajeros;
    }

    public List<Bus> getListaBus() {
        return listaBus;
    }

    public void setListaBus(List<Bus> listaBus) {
        this.listaBus = listaBus;
    }

    public List<Taxi> getListaTaxi() {
        return listaTaxi;
    }

    public void setListaTaxi(List<Taxi> listaTaxi) {
        this.listaTaxi = listaTaxi;
    }
 
    public void agregarBus(Bus bu) {
        this.listaBus.add(bu);
    }

    public void agregarTaxi(Taxi ta) {
        this.listaTaxi.add(ta);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Tipo_Veh\u00edculo=" + Tipo_Vehículo + ", a\u00f1o_veh\u00edculo=" + año_vehículo + ", capacidad_pasajeros=" + capacidad_pasajeros + '}';
    }

}
