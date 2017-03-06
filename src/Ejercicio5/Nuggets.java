/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import becker.robots.*;

public class Nuggets {
    
    private Robot joe;
    private City unal;
    private Thing ball;
    private Wall pared;

    public Nuggets() {
        this.unal = new City(10,10);
        this.joe = new Robot(this.unal,6,8,Direction.NORTH);
        this.ball = ball;
        this.pared = pared;
    }
    
    public void ponerPared(){
     
      //1
      //VERTICALES
      this.pared =new Wall(this.unal,3,3,Direction.WEST);
      this.pared =new Wall(this.unal,6,3,Direction.WEST);
      this.pared =new Wall(this.unal,5,6,Direction.EAST);
      this.pared =new Wall(this.unal,1,7,Direction.EAST);
      this.pared =new Wall(this.unal,2,8,Direction.EAST);
      this.pared =new Wall(this.unal,6,8,Direction.EAST);
      this.pared =new Wall(this.unal,6,5,Direction.EAST);
      this.pared =new Wall(this.unal,2,6,Direction.EAST);
      this.pared =new Wall(this.unal,3,7,Direction.EAST);
      
      //Horizontales
      this.pared =new Wall(this.unal,3,3,Direction.NORTH);
      this.pared =new Wall(this.unal,2,8,Direction.NORTH);
      this.pared =new Wall(this.unal,3,9,Direction.NORTH);
      this.pared =new Wall(this.unal,4,2,Direction.NORTH);
      this.pared =new Wall(this.unal,5,2,Direction.SOUTH);
      this.pared =new Wall(this.unal,4,3,Direction.SOUTH);
      this.pared =new Wall(this.unal,3,6,Direction.SOUTH);
      this.pared =new Wall(this.unal,5,6,Direction.SOUTH);
      this.pared =new Wall(this.unal,6,8,Direction.SOUTH);
      this.pared =new Wall(this.unal,4,5,Direction.SOUTH);
      this.pared =new Wall(this.unal,5,9,Direction.SOUTH);  
      this.pared =new Wall(this.unal,3,7,Direction.NORTH);
      this.pared =new Wall(this.unal,4,8,Direction.NORTH);
      
     for(int i=0; i<5;i++){         
        
        //2         
         if(i<2){                             
        //Verticales
         this.pared =new Wall(this.unal,i+1,4,Direction.WEST);         
         this.pared =new Wall(this.unal,i+4,2,Direction.WEST);
         this.pared =new Wall(this.unal,5+i,8,Direction.WEST);
         this.pared =new Wall(this.unal,5+i,4,Direction.EAST);
         this.pared =new Wall(this.unal,4+i,3,Direction.EAST);
         this.pared =new Wall(this.unal,3+i,6,Direction.WEST);
         this.pared =new Wall(this.unal,2+i,4,Direction.EAST);
         //horizontales
         this.pared =new Wall(this.unal,2,5+i,Direction.NORTH);
         this.pared =new Wall(this.unal,6,3+i,Direction.SOUTH);
         this.pared =new Wall(this.unal,4,7+i,Direction.SOUTH);        
         }
                  
         //3
         if(i<3){
         this.pared =new Wall(this.unal,i+3,9,Direction.EAST);
         }
         
         //4
         if(i<4){
         this.pared = new Wall(this.unal,1,i+4,Direction.NORTH);
         
     }
         
    }
    
            
}
    
    public void ponerNuggets(){
        this.ball = new Thing(this.unal,2,8); 
        this.ball = new Thing(this.unal,3,6); 
        this.ball = new Thing(this.unal,5,5); 
    }
    
    
    public void jugar(){
      joe.move();
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      joe.turnLeft();
      for(int i=0;i<2;i++){joe.move();}
      joe.turnLeft();
      joe.move();
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      joe.pickThing();
      for(int i=0;i<2;i++){joe.turnLeft();}
      joe.move();
      joe.turnLeft();
      joe.move();
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      for(int i=0;i<3;i++){joe.turnLeft();}
      for(int i=0;i<2;i++){joe.move();}
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      joe.turnLeft();
      joe.move();
      joe.pickThing();
      for(int i=0;i<2;i++){joe.turnLeft();}
      joe.move();     
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      joe.turnLeft();
      joe.move();      
      for(int i=0;i<3;i++){joe.turnLeft();}
      joe.move();
      joe.pickThing();
      joe.turnLeft();
      for(int i=0;i<2;i++){joe.move();}        
    }       
}
