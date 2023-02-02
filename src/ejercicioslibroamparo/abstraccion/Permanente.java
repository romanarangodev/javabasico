/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo.abstraccion;

import ejercicioslibroamparo.abstraccion.Empleado;

/**
 *
 * @author roman
 */
abstract public class Permanente extends Empleado{
    private String contrato;
    protected double deducciones;
    
    public Permanente(String nombre,String direccion,String rfc,String contrato){
        super(nombre,direccion,rfc);
        this.contrato=contrato;
    }
    
    abstract double calcularDeducciones();
}
