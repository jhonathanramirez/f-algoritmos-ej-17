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
public class Carrera {
    private String nombre;
    private String modalidad;
    
public void agregar_nombre(String n){
          nombre = n;
}
public String obtener_nombre(){
      return nombre;
}
public void agregar_modalidad(String n){
          modalidad = n;
}
public String obtener_modalidad(){
      return modalidad;
}
public Carrera(){
    modalidad = "Presencial";
}    
public Carrera(String md){
  modalidad = md;
}
public Carrera (String md,String x){
  modalidad = md ;
  nombre= x;
}
}