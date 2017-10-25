/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intitucion;

/**
 *
 * @author Usuario
 */
public class Asignatura {
 private String nombre;
 private int creditos;
 private int creditos2;
public void agregar_nombreAsig(String n){
          nombre = n;
}
public String obtener_nombreAsig(){
      return nombre;
  }
public void agregar_creditos(int n){
          creditos = n;
}
public int obtener_creditos(){
      return creditos;}
public void agregar_creditos2(int n){
          creditos2 = n;
}
public int obtener_creditos2(){
      return creditos2;
}
}


