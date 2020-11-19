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
public class Factura {

    String numero;
    Cliente client;
    Producto product;
    double subtotal;
    double total;
    
    public Factura(String numero, Cliente cl, Producto prod, double sub, double tot){
        this.numero = numero;
        this.client = cl;
        this.product = prod;
        this.subtotal = sub;
        this.total = tot;
    }
}
