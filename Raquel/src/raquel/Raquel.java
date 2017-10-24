/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raquel;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author joelf
 */
public class Raquel {

    public static void main(String[] args) {
        Vehiculo ve = new Vehiculo();
        Bus busGrande = new Bus("nuevo", 400, "Grande", "551", 650);
        Bus busGrande2 = new Bus("Viejo", 4400, "Grande", "fd", 650);
        Bus busGrande3 = new Bus("Futuro", 4080, "Grande", "gf", 650);
         
        ve.agregarBus(busGrande);
        ve.agregarBus(busGrande2);
        ve.agregarBus(busGrande3);
        
        System.out.println(ve.getListaBus());
        ve.getListaBus().remove(busGrande);
        System.out.println(ve.getListaBus());
    }
}
