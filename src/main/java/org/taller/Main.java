package org.taller;

import org.taller.Clases.Coche;
import org.taller.Clases.Matematicas;
import org.taller.Clases.ClaseConError;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nTaller 3: metodos static\n");

        System.out.println("Ejercicio 1: Coche con contador");
        Coche.mostrarContador(); // antes de crear objetos
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "CX-5");
        Coche c3 = new Coche("Renault", "Sandero");
        Coche.mostrarContador(); // después de crear 3 coches
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();

        System.out.println("\nEjercicio 2: Matemáticas static\n");
        System.out.println("10 + 5 = " + Matematicas.sumar(10, 5));
        System.out.println("10 - 5 = " + Matematicas.restar(10, 5));
        System.out.println("10 * 5 = " + Matematicas.multiplicar(10, 5));
        System.out.println("10 / 5 = " + Matematicas.dividir(10, 5));
        System.out.println("10 / 0 = ");
        Matematicas.dividir(10, 0); // prueba de división por cero

        System.out.println("\nEjercicio 3: Corrección de uso incorrecto de static\n");
        ClaseConError obj = new ClaseConError();
        System.out.println("Valor inicial: " + obj.valorInstancia);
        obj.metodoCorregidoInstancia();
        ClaseConError.metodoCorregidoStatic(obj);

        System.out.println("\n[Explicación] Un método static no tiene referencia 'this',");
        System.out.println("por tanto no puede acceder directamente a atributos de instancia.");
        System.out.println("Las soluciones son: 1. o se quita el 'static' del método, o");
        System.out.println("2 se recibe el objeto como parámetro.");
    }
}
