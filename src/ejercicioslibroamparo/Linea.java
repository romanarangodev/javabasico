/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo;

/**
 * Clase para crear líneas rectas en el plano cartesiano
 * Objetivo. Ilustrar la relacion de agregacion en objetos
 * @author roman
 * @see Punto
 * @version Septiembre 2015
 */
public class Linea {
    private Punto p1;
    private Punto p2;
    
    /**
     * Constructor por omision
     */
    Linea(){
        p1=new Punto(0,0);
        p2=new Punto(1,1);
    }
    
    /**
     * Constructor de una linea a partir de dos puntos
     * @param p1Ini - punto de origen
     * @param p2Ini - segundo punto
     */
    Linea(Punto p1Ini,Punto p2Ini){
        p1=p1Ini;
        p2=p2Ini;
    }
    /**
     * Constructor de copia
     * @param l - linea que se toma para crear una nueva
     */
    Linea(Linea l){
        p1=l.p1;
        p2=l.p2;
    }
    
    /**
     * Devuelve la pendiente de una recta
     * @return double - la pendiente de la recta
     */
    public double pendiente(){
        double divisor=p2.obtenerX()-p1.obtenerX();
        return (divisor!=0) ? (p2.obtenerY()-p1.obtenerY())/divisor : Double.POSITIVE_INFINITY;
    }
    
    /**
     * Determina la ecuacion de la recta
     * @return String - la ecuacion de la recta
     */
    public String ecuacion(){
    if(p1.obtenerX()==p2.obtenerX()){
        return "x= " + p1.obtenerX(); //recta paralela al eje y
    }
    return (ordenada()>0) ? "y=" + pendiente()+ "x +" + ordenada() : "y=" + pendiente()+ "x " + ordenada();
}
    /**
     * calcula la ordenada al origen de la recta dada
     * @return double - la ordenada al origen
     */
    public double ordenada(){
    return p1.obtenerX() == p2.obtenerX() ? Double.POSITIVE_INFINITY : p1.obtenerY()-pendiente()*p1.obtenerX();
}
    /**
     * Determina si un punto pertenece a la recta
     * @param p - Punto a determnar si esta en la recta
     * @return boolean - true si esta en la recta, false en caso contrario
     */
    public boolean contiene(Punto p){
        return p.estanAlineados(p1, p2);
    }
    
    /**
     * determina si dos lineas son la misma
     * @param l1 - Linea con al que se comparara la linea original
     * @return boolean - true si son la misma linea y false en otro caso
     */
    public boolean equals(Linea l1){
        return pendiente()==l1.pendiente() && ordenada()==l1.ordenada();
    }
    
    /**
     * Determina si dos lineas son paralelas
     * @param l1 - linea con al que se comparara la linea original
     * @return boolean - true si son paralelas, false en otro caso
     */
    public boolean esParalelaA(Linea l1){
        return pendiente()==l1.pendiente();
    }
    
    /**
     * Determina si dos lineas son perpendiculares
     * @param l1 - Linea con la que se comparara la linea original
     * @return boolean - true si son paralelas false en otro caso
     */
    public boolean esPerpendicularA(Linea l1){
        double m=pendiente();
        double m1=l1.pendiente();
        final double INFINITO= Double.POSITIVE_INFINITY;
        
        if(m==0 || m1==0 || m==INFINITO || m1==INFINITO){
            return ((m==0 && m1==INFINITO) || (m1==0 && m==INFINITO)) ? true : false;
        }
        return m==-1/m1;
    }
    
    /**
     * Determina el punto de interseccion entre dos lineas
     * @param l1 - la segunda linea
     * @return Punto - punto de interseccion
     */
    public Punto interseccion(Linea l1){
        double nuevaX,nuevaY;
        if(esParalelaA(l1)){
            nuevaX=nuevaY=Double.POSITIVE_INFINITY;
        }else{
            nuevaX=(ordenada()-l1.ordenada())/(l1.pendiente()-pendiente());
            nuevaY=pendiente()*nuevaX+ordenada();
        }
        return new Punto((int)nuevaX,(int)nuevaY);
    }
}
