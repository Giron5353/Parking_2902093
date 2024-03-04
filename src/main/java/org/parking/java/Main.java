package org.parking.java;

import org.parking.java.entities.Cliente;
import org.parking.java.entities.Cupo;
import org.parking.java.entities.Empleado;
import org.parking.java.entities.Pago;
import org.parking.java.entities.TipoVehiculo;
import org.parking.java.entities.Vehiculo;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Sistema de gestion de E/S
        // de vehiculos en un parking
        // 1. dos carritos:
        // Objetos(instancias)
        // 1.Tipo de clase
        // 2.nombre del objeto
        // 3.asignacion y new
        // 4.constructor del objeto
        Vehiculo carrito1 = new Vehiculo("ASD 789", TipoVehiculo.PARTICULAR);

        Vehiculo carrito2 = new Vehiculo("GOD 583", TipoVehiculo.CAMION);

        Vehiculo motico = new Vehiculo();
        motico.setPlaca("XS 439");

        // crear(instanciar)un cliente
        Cliente cliente1 = new Cliente("David", "Giron", 1010175353L);
        // invocar el metodo addCar
        cliente1.addVehicle(carrito1);
        cliente1.addVehicle(carrito2);
        cliente1.addVehicle("GIR", TipoVehiculo.MOTO);
        // recorrer la lista de vehiculos del cliente
        /*
         * for(Vehiculo veh :cliente1.misVehiculos){
         * System.out.println(veh.placa);
         * System.out.println(veh.tipoVehiculo);
         * System.out.println("------------");
         * }
         */
        Cupo cupito1 = new Cupo('A');
        Cupo cupito2 = new Cupo('B');

        Empleado empleado1 = new Empleado("Samuel", "Pepe", 12);
        Empleado empleado2 = new Empleado("David", "Giron", 1);

        LocalDateTime fechaHoraInicio = LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0);
        LocalDateTime fechaHoraFin = LocalDateTime.of(2024, Month.FEBRUARY, 10, 6, 15, 0);
        // Hacer registros(pagos) de vehiculos
        // Otra forma de hacerlo
        // Pago pago1 = new Pago(LocalDateTime.of(2024, Month.FEBRUARY, 1, 15, 30, 0),
        // LocalDateTime.of(2024,Month.FEBRUARY, 10, 6, 15, 0), 5000.0, carrito1,
        // cupito1);
        Pago pago1 = new Pago(fechaHoraInicio, fechaHoraFin, 5000.0, cliente1.misVehiculos.get(0), cupito1, empleado1);
        Pago pago2 = new Pago(fechaHoraInicio, fechaHoraFin, 10000.0, cliente1.misVehiculos.get(1), cupito2, empleado2);

        // añadir estos pagos a una lista de pagos

        List<Pago> misPagos = new ArrayList<Pago>();
        misPagos.add(pago1);
        misPagos.add(pago2);

        // recorrer los pagos para mostrar informacion
        for (Pago pag : misPagos) {
            System.out.println("|Placa: " + pag.getVehiculo().getPlaca() + "|" +
            "|Tipo: " + pag.getVehiculo().getTipoVehiculo() + "|" +
            "|Valor: " + pag.getValor() + "|" +
            "|Fecha y hora de inicio: " + pag.getFechaInicio() + "|" +
            "|Fecha y hora de fin: " + pag.getFechaHoraFin() + "|" +
            "|Cupo: " + pag.getCupo().getNombre() + "|" +
            "|Codigo empleado : " + pag.getEmpleado().getCodigo() + "|");
        }
    }
}