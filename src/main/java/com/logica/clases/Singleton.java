package com.logica.clases;

public class Singleton {

    // Se crea una variable estática para guardar la única instancia de la clase.
    private static Singleton instancia;

    // Constructor privado para evitar que se creen objetos desde fuera.
    private Singleton(){
        System.out.println("Creacion de instancia");
    }

    // Método público para acceder a la única instancia.
    public static Singleton getInstance(){
        if (instancia == null) { //Si la instancia esta vacia
            instancia = new Singleton(); // Solo se crea si aún no existe
        }
        return instancia; // Retorna la instancia recien creada.
                         // Si ya existe, devuelve la misma.
    }

    // Un método normal para hacer algo
    public void saludar() {
        System.out.println("Hola desde el Singleton!");
    }
}
