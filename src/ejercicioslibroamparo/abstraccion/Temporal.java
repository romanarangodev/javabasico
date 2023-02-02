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
public class Temporal extends Empleado {
    public Temporal(String nombre,String direccion,String rfc,double p){
        super(nombre,direccion,rfc);
        pago=p;
    }
    public double calcularSueldo(){
        return pago;
    }
}
