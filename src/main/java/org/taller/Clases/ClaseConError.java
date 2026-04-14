package org.taller.Clases;

public class ClaseConError {
    public int valorInstancia = 42; // atributo no estático

    // Version incorrecta (no compilaría):
    // static void metodoMalo() {
    //     valorInstancia = 100; // da un error: no se puede acceder a atributo de instancia desde static
    // }

    // Version corregida — opción A: convertir el método a instancia
    public void metodoCorregidoInstancia() {
        valorInstancia = 100; //método de instancia puede acceder a atributos de instancia
        System.out.println("Valor modificado (instancia): " + valorInstancia);
    }

    // Version corregida 2 — opción B: pasar el objeto como parámetro al método static
    public static void metodoCorregidoStatic(ClaseConError obj) {
        obj.valorInstancia = 200; //accede al atributo a través de la referencia
        System.out.println("Valor modificado (static con ref): " + obj.valorInstancia);
    }
}