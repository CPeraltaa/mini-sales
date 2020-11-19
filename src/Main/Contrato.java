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
public class Contrato {
    Factura fact;
    int cuotas;
    int cuotasCanceladas;
    String fechaPago;
    
    public Contrato(Factura f, int cuot, int cuotC, String fecha){
        this.fact = f;
        this.cuotas = cuot;
        this.cuotasCanceladas = cuotC;
        this.fechaPago=fecha;
    }
    
}
