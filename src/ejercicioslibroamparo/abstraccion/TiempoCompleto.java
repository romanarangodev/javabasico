/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo.abstraccion;

/**
 *
 * @author roman
 */
public class TiempoCompleto extends Permanente {
    private double pagoQuincenal;
    private final double porcentaje=0.05;
    
    public TiempoCompleto(String nombre,String direccion,String rfc,String contrato,double pq){
        super(nombre,direccion,rfc,contrato);
        pagoQuincenal=pq;
    }
    @Override
    public double calcularDeducciones(){
        return pagoQuincenal*porcentaje;
    }
    
    @Override
    public double calcularSueldo(){
        deducciones=calcularDeducciones();
        pago=pagoQuincenal-deducciones;
        return pago;
    }
}
