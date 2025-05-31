package com.logica.main;

import com.logica.clases.SesionUsuario;
import com.logica.clases.Singleton;
import com.logica.clases.Usuario;

public final class Main {
    public static void main(String[] args) {

        /*EJERCICIO:
         * Explora el patrón de diseño "singleton" y muestra cómo crearlo
         * con un ejemplo genérico.*/

        // Obtenemos la unica instancia del metodo
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        // Llamamos un método de la instancia
        s1.saludar();

        // Comprobar que si son el mismo objeto
        System.out.println(s1 == s2);// true

        System.out.println();
        System.out.println("************** EXTRA *************");
        System.out.println();

         /* Utiliza el patrón de diseño "singleton" para representar una clase que
         * haga referencia a la sesión de usuario de una aplicación ficticia.
         * La sesión debe permitir asignar un usuario (id, username, nombre y email),
         * recuperar los datos del usuario y borrar los datos de la sesión.*/

        Usuario usuario1 = new Usuario(1, "daniel90", "Daniel Aguilar", "daniel@example.com");

        // Obtener la instancia única de la sesión
        SesionUsuario sesion = SesionUsuario.getInstancia();

        // Iniciar sesión
        sesion.iniciarSesion(usuario1);

        // Mostrar datos del usuario
        if (sesion.haySesionActiva()) {
            System.out.println("Usuario en sesión: " + sesion.getUsuario());
        }

        // Cerrar sesión
        sesion.cerrarSesion();

        // Verificar que ya no hay sesión
        if (!sesion.haySesionActiva()) {
            System.out.println("No hay usuario en sesión.");
        }
    }
}