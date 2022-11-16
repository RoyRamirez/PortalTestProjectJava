package org.ejemplo.servicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

/*
 * Todos los metodos deben llevar la anotación @Test
 * Todos los nombres de los métodos deben comenzar con la palabra "test"
 * 
 * */

class TestServicio extends TestCase {

  ServicioEmpleado servicioEmpleado;
  
  @Test
  void test() {
    servicioEmpleado = new ServicioEmpleado();
  }
  
  @Test
  public void testSalarioBono() {
    test();
    assertTrue(servicioEmpleado.salarioBono(10000.0, 5000.0)== 15000.0);
  }
  
  @Test
  public void testSalarioPrestamo() {
    test();
    assertEquals(servicioEmpleado.salarioPrestamo(10000.0, 5000.0), 5000.0);
  }

}
