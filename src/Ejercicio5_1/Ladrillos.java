/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5_1;

import becker.robots.*;
import java.awt.Color;


public class Ladrillos {
       
    private City un;
    private Robot joe;
    private Wall pared;
    private Thing ball;
    private boolean l[][];

    public Ladrillos() {
        this.un = new City(12,14);
        this.joe = new Robot(this.un,10,1,Direction.NORTH);            
        this.l = new boolean[5][5];
        for(int k=0; k<5;k++){
        for(int j=0;j<5;j++){            
        this.l[k][j]=false; 
        }
        }
        
    }
    
    public void ponerPared(){
        for(int i=0;i<5;i++){
            this.pared = new Wall(this.un,i+5,1,Direction.WEST);
            this.pared = new Wall(this.un,5,i+1,Direction.NORTH);
            this.pared = new Wall(this.un,i+5,5,Direction.EAST);
            if(i<4){this.pared = new Wall(this.un,9,i+2,Direction.SOUTH);}
            
            this.pared = new Wall(this.un,i+2,7,Direction.WEST);
            this.pared = new Wall(this.un,2,i+7,Direction.NORTH);
            this.pared = new Wall(this.un,i+2,11,Direction.EAST);
            if(i<4){this.pared = new Wall(this.un,6,i+8,Direction.SOUTH);}            
        }
    }
    
    public void ladrillos(){
        this.ball = new Thing(this.un,6,2);
        this.ball = new Thing(this.un,6,4);
        this.ball = new Thing(this.un,6,1);
        this.ball = new Thing(this.un,6,5);
        this.ball = new Thing(this.un,8,1);
        this.ball = new Thing(this.un,8,5);
        this.ball = new Thing(this.un,9,2);
        this.ball = new Thing(this.un,9,4);                
    } 
              
    public void memorizar(){
        
joe.move();
for(int i=0; i<3; i++){joe.turnLeft();}
    for(int r=0; r<2;r++){
        if(r==1){joe.setColor(Color.BLUE);}
        //repetir dentro de los cuadros
        for(int k=5;k>0;k--){       
            //mover fila
            for(int i=0;i<5;i++){            
                //recoger y obtener direccion
                if(r==0){
                    if(joe.canPickThing()==true){           
                    this.l[k-1][i] = true; 
                    joe.pickThing();                
                    }
                }
                //colocar los ladrillos en otra cuadro
                if(r==1){
                    if(this.l[k-1][i]==true){
                    joe.putThing();
                    }
                }
                //mover en la fila
                if(i<4){joe.move();}         
            }
            //cambio de fila a izquierda
            if(k==5||k==3){
                joe.turnLeft();
                joe.move();
                joe.turnLeft();
            }
            //cambio de fila a derecha
            else if(k==4||k==2){
                for(int i=0; i<3; i++){joe.turnLeft();}
                joe.move();
                for(int i=0; i<3; i++){joe.turnLeft();}
            }
       
        }
        //salida joe
        for(int i=0; i<2; i++){joe.turnLeft();}
        for(int i=0; i<4; i++){joe.move();}
        joe.turnLeft();
        for(int i=0; i<5; i++){joe.move();}
        //ubicar pos final
        joe.turnLeft();
        joe.move();
        //salida a otro cuadro
        if(r==0){        
            for(int i=0; i<5; i++){joe.move();}
            joe.turnLeft();
            for(int i=0; i<4; i++){joe.move();}
            for(int i=0; i<3; i++){joe.turnLeft();}
        }
     }
    }    
}
    