/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Carlos Peralta
 */
public class Cliente {
    String codigo;
    String nombre;
    String nit;
    String direccion;
    
    public Cliente(String cod, String nom, String nit, String dir){
        this.codigo = cod;
        this.nombre = nom;
        this.nit = nit;
        this.direccion = dir;
    }
}
