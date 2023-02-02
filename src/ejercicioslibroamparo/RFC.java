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
public class RFC {
    static public void main(String [] pps)
    {
      String nombre;
      String fechaNac;
      String rfc;
      InOut io= new InOut();
      
      System.out.println("dame el nombre completo");
      nombre=io.readString();
      nombre=nombre.trim();
      int pos = nombre.indexOf("");
      String n= nombre.substring(0, pos);
      nombre = nombre.substring(pos);
      
      nombre=nombre.trim();
      pos=nombre.indexOf("");
      rfc=nombre.substring(0, 2);
      nombre=nombre.substring(pos);
      
      nombre=nombre.trim();
      pos=nombre.indexOf("");
      rfc+=nombre.substring(0, 1);
      rfc+=n.substring(pos);
      
      System.out.println("Nombre = "+ rfc);
    }
    
}
