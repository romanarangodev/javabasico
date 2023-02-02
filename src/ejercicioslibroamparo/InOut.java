/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicioslibroamparo;
import java.io.*;
import java.util.*;

/**
 *
 * @author roman
 */
public class InOut {
    private static InputStreamReader is = new InputStreamReader(System.in);
    private static BufferedReader br = new BufferedReader(is);
    private StringTokenizer st;
    
    /*
    metodo que permite obtener el siguiente elemento de una linea leida
    @throws IOException
    */
    private StringTokenizer getToken() throws IOException{
        String s=br.readLine();
        return new StringTokenizer(s);
    }
    
    /*
    Metodo que permite leer un valor de tipo entero
    @return int - dato leido
    */
    public int readInt(){
        try
        {
            st=getToken();
            return Integer.parseInt(st.nextToken());
        }catch(IOException ioe){
            System.err.println("IO Exception in InOut.readInt");
            return 0;
        }
        
    }
    
    /*
    Metodo que permite leer un valor de tipo double
    @return double - dato leido
    */
    public double readDouble(){
        try
        {
            st=getToken();
            return new Double(st.nextToken()).doubleValue();
        }catch(IOException ioe){
            System.err.println("IO Exception in InOut.readDouble");
            return 0.0;
        }
        
    }
    
    /*
    Metodo que permite leer un valor de tipo char
    @return char - dato leido
    */
    public char readChar(){
        try
        {
            String s=br.readLine();
            return s.charAt(0);
        }catch(IOException ioe){
            System.err.println("IO Exception in InOut.readChar");
            return 0;
        }
        
    }
    
    /*
    Metodo que permite leer un valor de tipo string
    @return String - dato leido
    */
    public String readString(){
        try
        {
            return br.readLine();
        }catch(IOException ioe){
            System.err.println("IO Exception in InOut.readString");
            return "";
        }
        
    }
    
     /*
    Metodo que permite leer un valor de tipo string del tamaño especificado
    @param numCaracteres - cantidad de caracteres de la cadena que se leera
    @return String - dato leido
    */
    public String readString(int numCaracteres){
        try
        {
            return br.readLine().substring(0, numCaracteres);
        }catch(IOException ioe){
            System.err.println("IO Exception in InOut.readString");
            return "";
        }
        
    }
}
