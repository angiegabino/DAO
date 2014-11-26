
package com.gabino.controller;

import com.gabino.model.DAOUsuarioImpl;
import java.util.ArrayList;

public class GenerarUsuario {
    
    public static String obtenerUsuario() throws Exception {
        DAOUsuarioImpl du = new DAOUsuarioImpl();
        return du.obtenerTodos();
    }
    
    /*public static ArrayList<Usuario> obtenerUsuario(){
    
    
    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
  
     //Primero creamos tres direcciones
     Direccion d1 = new Direccion("Onimex", 55030 , "El Potrero", "Estado de México");
     Direccion d2 = new Direccion("Francisco Villa", 55090 , "San Carlos", "Estado de México");
     Direccion d3 = new Direccion("Calle de la Muerte", 55030 , "San Geronimo", "Chihuahua");
    
     //Ahora asociamos las direcciones a sus usuarios
     Usuario u1 = new Usuario("Angelica", 20, 8000f);
     Usuario u2 = new Usuario("Erick", 22, 10000f);
     Usuario u3 = new Usuario("Paquita La Del Barrio", 65, 20000f);
     
     usuarios.add(u1);
     usuarios.add(u2);
     usuarios.add(u3);
     
     return usuarios;
    
    }*/
}
