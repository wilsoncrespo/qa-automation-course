package edu.alsie.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

  /* Ejemplo de la estructura base de una prueba unitaria
  @Test
  public void testSayHello() {
    // Contexto
    HelloWorld helloWorld = new HelloWorld();

    // Datos esperados (generación de datos)
    String expected = "Hello World";

    // Obtener datos, calcular el resultado
    String result = helloWorld.sayHello();

    // Assertions
    assertEquals(expected, result);
  }*/

  @Test
  public void testSayHelloShouldBeAlwaysLowerCase() {
    HelloWorld helloWorld = new HelloWorld();
    String expected = "hello world";
    String result = helloWorld.sayHello();

    assertEquals(expected, result);
  }
}
