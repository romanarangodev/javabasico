/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo;

/**
 *
 * @author roman
 */
public class PruebaPunto {
    public static void main(String [] pps){
        Punto inicio=new Punto(4,-30),
                fin=new Punto(10,10),
                otro=new Punto();
        
        System.out.println("La distancia entre "+ inicio+" y "+ fin +" es "+inicio.distancia(fin));
        System.out.print("Los puntos ");
        boolean estan=inicio.estanAlineados(fin, otro);
        if(estan){
            System.out.print("si ");
        }else{
            System.out.print("no ");
        }
        System.out.println("estan alineados ");
    }
}
