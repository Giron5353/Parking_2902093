package org.parking.java.entities;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
    public String nombres;
    public String apellidos;
    public Long numeroIdentificacion;
    public List<Vehiculo> misVehiculos = new ArrayList<Vehiculo>();
    

    
    public Cliente() {
    }

    public Cliente(String nombres, String apellidos, Long numeroIdentificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    //Definir metodo de la clase
    //addCar: vinvular un carrito al cliente
    public void addVehicle(Vehiculo vehiculo){

        //añadir el carrito a la lista
        //this:para acceder a atributos
        //y metodos al interior del objeto
        //NOTA:usenla al interior de metodos
        this.misVehiculos.add(vehiculo);
    }
    
    //otra sobrecarga del metodo addvehivle
    public void addVehicle(String placa,TipoVehiculo tv){
        Vehiculo v = new Vehiculo();
        v.placa = placa;
        v.tipoVehiculo = tv;
        this.misVehiculos.add(v);
    }
}
