package org.parking.java.entities;
import java.time.LocalDateTime;

public class Pago {

    //atributos intrinsecos
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaHoraFin;
    private Double valor;

    //atributos de relacion 
    private Vehiculo vehiculo;
    private Cupo cupo;
    private Empleado empleado;
    

    //constructor por defecto
    public Pago() {
    }

//constructor parametrizado
    public Pago(LocalDateTime fechaInicio, LocalDateTime fechaHoraFin, Double valor, Vehiculo vehiculo, Cupo cupo,
            Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.fechaHoraFin = fechaHoraFin;
        this.valor = valor;
        this.vehiculo = vehiculo;
        this.cupo = cupo;
        this.empleado = empleado;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cupo getCupo() {
        return cupo;
    }

    public void setCupo(Cupo cupo) {
        this.cupo = cupo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    
    
}
