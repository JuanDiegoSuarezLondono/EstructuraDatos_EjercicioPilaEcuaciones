/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopilaecuaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author suare
 */
public class EjercicioPilaEcuaciones {
    
    static LinkedList<Character> nodo=new LinkedList<Character>();
    static boolean bien=true;
    public static void main(String[] args) throws IOException {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       String str=new String();
       char c;
       System.out.println("Ingrese la ecuacion");
       str=br.readLine();
       for(int i=0;i<str.length();i++) {
           c=str.charAt(i);
           validar(c);
       }       
       if(bien==true) {
           System.out.println("Esta wea esta bien");
       }
       else {
           System.out.println("Sos un animal para las matematicas, dedicate a vender tamales");
       }
    }    
     
    static void validar(char c) {
        switch(c){
            case '{':
                nodo.push('}');
            break;
            
            case '[':
                nodo.push(']');
            break;
            
            case '(':
                nodo.push(')');
            break;
            
            case ')':
                if(nodo.peekFirst()==null){
                    bien=false;
                }
                else {  
                    if(nodo.peekFirst().equals(c)) {
                        nodo.pop();
                    }   
                    else {
                        bien=false;
                    }
                }
            break;
            
            case ']':
                if(nodo.peekFirst()==null){
                    bien=false;
                }
                else {  
                    if(nodo.peekFirst().equals(c)) {
                        nodo.pop();
                    } 
                    else {
                        bien=false;
                    }
                }
            break;
            
            case '}':
                if(nodo.peekFirst()==null){
                    bien=false;
                }
                else {    
                    if(nodo.peekFirst().equals(c)) {
                        nodo.pop();
                    } 
                    else {
                        bien=false;
                    }
                }
                
            break;
        }        
    }
}
