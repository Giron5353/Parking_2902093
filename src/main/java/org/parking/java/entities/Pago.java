package org.parking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //atributos intrinsecos
    public LocalDateTime fechaInicio;
    public LocalDateTime fechaHoraFin;
    public Double valor;

    //atributos de relacion 
    public Vehiculo vehiculo;
    public Cupo cupo;
    

    //constructor por defecto
    public Pago() {
    }

    //constructor parametrizado
    public Pago(LocalDateTime fechaInicio, LocalDateTime fechaHoraFin, Double valor, Vehiculo vehiculo, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
    }
}
