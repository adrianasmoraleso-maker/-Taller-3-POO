package org.taller.Clases;

public class Coche {
    public String marca;
    public String modelo;
    public static int contadorCoches = 0; // atributo estático compartido por todos los objetos

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++; // se incrementa cada vez que se crea un Coche
    }

    // Método estático para mostrar el contador
    public static void mostrarContador() {
        System.out.println("Total de coches creados: " + contadorCoches);
    }

    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo);
    }
}
