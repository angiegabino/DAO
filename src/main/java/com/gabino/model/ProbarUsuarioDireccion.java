
package com.gabino.model;


public class ProbarUsuarioDireccion {
    
    public static void main(String args[]) throws Exception {

    DAOUsuarioImpl du = new DAOUsuarioImpl();
    System.out.println(du.obtenerTodos());

    }
}
