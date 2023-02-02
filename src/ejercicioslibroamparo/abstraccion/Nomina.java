/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo.abstraccion;

import ejercicioslibroamparo.abstraccion.PorHoras;
import ejercicioslibroamparo.abstraccion.TiempoCompleto;
import ejercicioslibroamparo.abstraccion.Temporal;
import ejercicioslibroamparo.abstraccion.Empleado;

/**
 *
 * @author roman
 */
public class Nomina {
    public static void main(String [] pps){
        Empleado [] p=new Empleado[3];
        p[0]=new Temporal("Juan Perez","dir 1 temporal","ASDFG56778977",50);
        p[1]=new PorHoras("Empleado por horas","dir 1 por horas","DFGTVHG5676767","Contrato 45",34,37);
        p[2]=new TiempoCompleto("Empleado tiempo completo","dir 1 tiempo completo","ADFGT6345969","Contrato 56",120);
        
        System.out.println("NOMINA PARA LA EMPRESA ABSTRACTA S.A DE C.V.");
        for(int i=0;i<p.length;i++){
            System.out.println("El empleado: " + p[i].getNombre() + "gana " + p[i].calcularSueldo());
        }
    }
}
