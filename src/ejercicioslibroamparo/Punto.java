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
public class Punto {
    //Atributos
    private int x;  //Coordenada x
    private int y;  //Coordenada y
    
    
    private int atributo1;
    
    
    private int atributo2;
    
    private String roman;
    
    //Metodos
    //METODOS CONSTRUCTORES
    /**
     * costructor de un punto, crea un punto con coordenadas (0,0)
     */
    public Punto(){
        x=y=0;
    }
    
    /**
     * Constructor de un punto a partir de dos numeros enteros que
     * representan la coordendadel nuevo punto
     * @param xIni - coordenada x del nuevo punto
     * @param yIni - coordenda y del nuevo punto
     */
    public Punto(int xIni,int yIni){
        x=xIni;
        y=yIni;
    }
    
    /**
     * Constructor de un punto a partir de dos numeros enteros que
     * representan la coordenda del nuevo punto, haciendo referencia a si mismo.
     * @param x - coordenada x del nuevo punto
     * @param y - coordenda y del nuevo punto
     */
    /*public Punto(int x,int y){
        this.x=x;
        this.y=y;
    }*/
    /**
     * Constructor de copia, crea un punto a partir de un objeto de su misma clase
     * @param p - punto a partir del cual se creara el nuevo
     */
    public Punto(Punto p){
        x=p.x;
        y=p.y;
    }
    
    //otra forma de crear el constructor de copia mediante otro constructor
    /*public Punto(Punto p){
        this(p.x,p.y);
    }*/
    //Metodos MODIFICADORES
    
    /**
     *Asigna valor a la coordenda del punto x 
     *@param nuevaX - nuevo valor para la coordenada x
     */
    public void asignarX(int nuevaX){
        x=nuevaX;
    }
    
    /**
     * Asigna valor a la coordenada y del punto
     * @param nuevaY - nuevo valor para la coordenda y
     */
    public void asignarY(int nuevaY){
        y=nuevaY;
    }
    
    //METODOS DE ACCESO
    
    /**
     * Regresa la coordenada x del punto
     * @return int - la coordenda x del punto
     */
    public int obtenerX(){
        return x;
    }
    
    /**
     * Regresa la coordenda y del punto
     * @return int - la coordenda y del punto
     */
    public int obtenerY(){
        return y;
    }
    
    //OTROS METODOS COLABORADORES
    /**
     * Permite desplazar un punto
     * @param deltaX - desplazamiento en el eje de las xs.
     * @param deltaY - desplazamiento en el eje de las ys.
     */
    public void desplazar(int deltaX, int deltaY){
        x+=deltaX;
        y+=deltaY;
    }
    
    //METODOS CALCULADORES
    /**
     * determina la distancia entre dos puntos usando la formula
     * ((x2-x1)elevado al cuadrado +(y2-y1)elevado al cuadrado)eleveado a la 1/2
     * @param p - punto respecto al que se se quiere determianr la distancia
     * @return double - distancia entre los dos puntos
     */
    public double distancia(Punto p){
        return Math.sqrt((double)((x-p.obtenerX())*(x-p.obtenerX())+(y-p.obtenerY())*(y-p.obtenerY())));
    }
    
    /**
     * Determina si tres puntos estan alineados verificando que se cumpla la
     * igualdad: (y-y1)*(x2-x1)=(y2-y1)*(x-x1)
     * @param p1 - Punto que con p2 y el que llama verifica si esten alineados
     * @param p2 - punto que con p1 y el que llama verifica si estan alineados
     * se verificara si estan alineados
     * @return true si estan alineados, flase en otro caso.
     */
    public boolean estanAlineados(Punto p1,Punto p2){
        return (y-p1.obtenerY()*(p2.obtenerX()-p1.obtenerX())==(p2.obtenerY()-p1.obtenerY())*(x-p1.obtenerX()));
    }
    
    /**
     * Determina si dos puntos son iguales
     * @param p - punto contra el cual se va a comparar
     * @return boolean - true si son iguales y flase en otro caso
     */
    public boolean esIgual(Punto p){
        return x==p.obtenerX() && y==p.obtenerY();
    }
    
    /**
     * determina si dos puntos son iguales. Se utiliza en los operadores de comparacion de igualdad y deigualdad
     * @param p - punto contra el cual se va a comparar
     * @return boolean - true si son iguales, false en otro caso
     */
    @Override
    public boolean equals(Object p){
        Punto pto=(Punto)p;
        return x==pto.obtenerX() && y==pto.obtenerY();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.x;
        hash = 47 * hash + this.y;
        return hash;
    }
    
    /**
     * Metodo para convertir un Punto a caena de caracteres
     * @return String - el punto en formato de cadena
     */
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
