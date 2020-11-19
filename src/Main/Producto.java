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
public class Producto {
    String nombre;
    String codigo;
    int stock;
    double costo;
    double venta;
    String tipoProd;
    
    public Producto(String nom, String cod, int sto, double cost, double venta, String tipo){
        this.nombre = nom;
        this.codigo = cod;
        this.stock = sto;
        this.costo = cost;
        this.venta = venta;
        this.tipoProd = tipo;
    }
}
