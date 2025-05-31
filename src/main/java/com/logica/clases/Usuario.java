package com.logica.clases;

public class Usuario {

    private int id;
    private String username;
    private String nombre;
    private String email;

    public Usuario(int id, String username, String nombre, String email) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters
    public int getId() { return id; }
    public String getUsername() { return username; }
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "ID: " + id + ", Username: " + username + ", Nombre: " + nombre + ", Email: " + email;
    }

    
}
