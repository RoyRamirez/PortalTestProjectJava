package org.ejemplo.servicio;

/*
 * Ningún empleado debe tener un bono mayor a 10,000
 * Nungún empleado debe tener un prestamo mayor a 5,000 
 * 
 * */

public class ServicioEmpleado {

  public double salarioBono(double salario, double bono) {
    return salario + bono;
  }
  
  public double salarioPrestamo(double salario, double prestamo) {
    return salario - prestamo;
  }
}
