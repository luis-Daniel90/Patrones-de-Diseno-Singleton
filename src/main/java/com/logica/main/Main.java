package com.logica.main;

import com.logica.clases.Singleton;

public final class Main {
    public static void main(String[] args) {

        /*
 * EJERCICIO:
 * Explora el patrón de diseño "singleton" y muestra cómo crearlo
 * con un ejemplo genérico.*/

 // Obtenemos la unica instancia del metodo
 Singleton s1 = Singleton.getInstance();
 Singleton s2 = Singleton.getInstance();

 // Llamamos un método de la instancia
 //s1.saludar();
 
// Comprobar que si son el mismo objeto
 System.out.println(s1==s2);//true

 System.out.println();
 System.out.println("************** EXTRA *************");
 System.out.println();

 /* Utiliza el patrón de diseño "singleton" para representar una clase que
 * haga referencia a la sesión de usuario de una aplicación ficticia.
 * La sesión debe permitir asignar un usuario (id, username, nombre y email),
 * recuperar los datos del usuario y borrar los datos de la sesión.
 */
    }
}
