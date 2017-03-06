/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;
import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class Main {
    
    public static void main(String[] args){
        Columnas c = new Columnas();        
        
        System.out.println("Numero de Columnas ? del 1-10");        
        Scanner col = new Scanner(System.in);
        int co = col.nextInt();        
        
        for(int i=0;i<co;i++){        
        int l=0;
        System.out.println("Numero de objetos en columna "+ (i+1) +" del 1 a 10:");
        Scanner sc = new Scanner(System.in);
        l= sc.nextInt();
            c.ponerColumnas(l,i);            
        if(i==co-1){
            System.out.println("Pare de digitar :P / Y presione Enter y Start");            
        }                
        }
        
        c.ordenar(co);
    }    
    
}
