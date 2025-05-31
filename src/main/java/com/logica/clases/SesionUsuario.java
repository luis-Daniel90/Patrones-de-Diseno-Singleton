package com.logica.clases;

public class SesionUsuario {
    
    private static SesionUsuario instancia;
    private Usuario usuario;

    // Constructor privado para que nadie pueda crear más instancias
    private SesionUsuario() {}

    // Método para obtener la instancia única
    public static SesionUsuario getInstancia() {
        if (instancia == null) {
            instancia = new SesionUsuario();
        }
        return instancia;
    }

    // Método para asignar un usuario a la sesión
    public void iniciarSesion(Usuario usuario) {
        this.usuario = usuario;
        System.out.println("Usuario conectado: " + usuario.getUsername());
    }

    // Método para obtener los datos del usuario
    public Usuario getUsuario() {
        return usuario;
    }

    // Método para cerrar sesión (eliminar usuario)
    public void cerrarSesion() {
        System.out.println("Cerrando sesión del usuario: " + (usuario != null ? usuario.getUsername() : "ninguno"));
        usuario = null;
    }

    // Saber si hay sesión activa
    public boolean haySesionActiva() {
        return usuario != null;
    }
}
