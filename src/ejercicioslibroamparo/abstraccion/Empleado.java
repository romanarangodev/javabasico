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
abstract public class Empleado extends Persona {
    protected double pago;
    
    public abstract double calcularSueldo();
    
    public Empleado(String nombre,String direccion,String rfc){
        super(nombre,direccion,rfc);
        pago=0;
    }
}
