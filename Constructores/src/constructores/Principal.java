/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;
/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {

        Carrera c = new Carrera();
        c.agregar_nombre("Informatica");
        c.agregar_modalidad("Distancia");
        System.out.println(c);
        
        Carrera c2 = new Carrera("Electronica");
        System.out.println(c2.obtener_modalidad());
        Carrera c3 = new Carrera("semipresencial","Distancia");
        System.out.println(c3.obtener_modalidad());
        c3.agregar_modalidad("Distancia");
        System.out.println(c3.obtener_modalidad());
        c3.agregar_modalidad(c3.obtener_modalidad().toUpperCase());
        System.out.println(c3.obtener_modalidad());
    }
}