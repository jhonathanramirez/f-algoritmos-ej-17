/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asignatura;
import academico.Carrera;
/**
 *
 * @author Usuario
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
public void agregar_nombre(String n){
          nombre = n;
}
public String obtener_nombre(){
      return nombre;
}
public void agregar_creditos(int n){
          creditos = n;
}
public int obtener_creditos(){
      return creditos;
}
public void establecer_carrera(Carrera c){
    carrera= c;
}
public Carrera obtener_carrera(){
    return carrera;
}
        
public Asignatura(Carrera c){
    carrera = c;
    nombre = "Informatica";
    creditos=5;

}
@Override
    public String toString(){
        String cadena = String.format("Asignatura\n  Nombre:%s\n"
                +"  Creditos: %d\n"
                +"  Carrera:%s\n"
                +"  Modalidad:%s",
                obtener_nombre(), obtener_creditos()
                ,obtener_carrera().obtener_modalidad(),obtener_carrera().obtener_nombre());
return cadena;

}
}