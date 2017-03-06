/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import becker.robots.*;

public class Columnas {
   private City unal;
   private Robot joe;
   private Thing ball;
   private int orde[];
   
   
    public Columnas(){
        this.unal = new City(11,11);
        this.joe = new Robot(this.unal,10,1,Direction.NORTH);        
    }
    
    public void ponerColumnas(int l, int r){
        for(int i=0;i<l;i++){
            this.ball = new Thing(this.unal,9-i,r+1);
        }
    }
    
    public void ordenar(int co){
        
    joe.setSpeed(20);
    //llenar vector
    this.orde = new int[10];
        
      for(int j=0; j<co;j++){
      int l=0;
         for(int i=0; i<10;i++){        
            //dar valor al vector en esa posicion
            if(joe.canPickThing()){
               l++;   
               joe.pickThing();
            }
            this.orde[j] = l;
            joe.move();
         }
         //posicionar para siguiente columna
         if(j%2==0){
            for(int i=0;i<3;i++){joe.turnLeft();}
            joe.move();
            for(int i=0;i<3;i++){joe.turnLeft();}
         }
         else{
             joe.turnLeft();
             joe.move();
             joe.turnLeft();
         }
       }
      
    //ordenar vector
    for (int o=0;o<co;o++){
      for(int u=0;u<co-1;u++){
        if(this.orde[u+1]<this.orde[u]){
           int f=0;
           f = this.orde[u+1];
           this.orde[u+1]=this.orde[u];
           this.orde[u]=f;
        }
     }
    }
      
    //posisionar joe
    if(co%2==1){
        for(int i=0;i<10;i++){joe.move();}
        for(int i=0;i<3;i++){joe.turnLeft();}
        for(int i=0;i<co;i++){joe.move();}
        for(int i=0;i<3;i++){joe.turnLeft();}
        joe.move();
    }
    else{
       joe.turnLeft();      
       for(int i=0;i<co;i++){joe.move();}   
       for(int i=0;i<3;i++){joe.turnLeft();}
       joe.move();
    }              
    
       //ya ordenar         
    for(int p=0; p<co;p++){
      for(int i=0;i<this.orde[p];i++){
        joe.putThing();
        joe.move();
      }
       
      for(int i=0;i<2;i++){joe.turnLeft();}
      for(int i=0;i<this.orde[p];i++){joe.move();}       
      joe.turnLeft();
      joe.move();
      joe.turnLeft();       
    }
       
       
    }  
      


}