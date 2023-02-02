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
public class PorHoras extends Permanente {
    private double horasTrabajadas;
    private double sueldoHora;
    private final double porcentaje=0.02;
    
    public PorHoras(String nombre,String direccion,String rfc,String contrato,double ht,double sh){
        super(nombre,direccion,rfc,contrato);
        horasTrabajadas=ht;
        sueldoHora=sh;
    }
    @Override
    public double calcularDeducciones(){
        return (horasTrabajadas*sueldoHora)*porcentaje;
    }
    
    @Override
    public double calcularSueldo(){
        deducciones=calcularDeducciones();
        pago=(horasTrabajadas*sueldoHora)-deducciones;
        return pago;
    }
}
