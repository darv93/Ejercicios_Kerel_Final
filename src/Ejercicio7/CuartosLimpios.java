package Ejercicio7;

import becker.robots.*;

public class CuartosLimpios {
    
    private City unal;
    private Robot max;
    private Thing ball;
    private Wall pared;
    
    
    public CuartosLimpios(){
        this.unal = new City(10,10);
        this.max =  new Robot(this.unal,8,4,Direction.NORTH);
    }   
    
    public void ponerBasura(){
        for(int j=0;j<4;j++){
        this.pared = new Wall(this.unal,j,4,Direction.WEST);
        this.pared = new Wall(this.unal,j,4,Direction.EAST);
        if(j==2){
        this.pared = new Wall(this.unal,j+5,3,Direction.WEST);
        this.pared = new Wall(this.unal,j+5,3,Direction.NORTH);
        this.pared = new Wall(this.unal,j+5,3,Direction.SOUTH);
        }
        else{this.pared = new Wall(this.unal,j+5,4,Direction.WEST);        }
        this.pared = new Wall(this.unal,j+5,4,Direction.EAST);
        
        this.pared = new Wall(this.unal,4,j,Direction.SOUTH);
        this.pared = new Wall(this.unal,4,j,Direction.NORTH);
        this.pared = new Wall(this.unal,4,j+5,Direction.SOUTH);
        this.pared = new Wall(this.unal,4,j+5,Direction.NORTH);
        
        for(int i=0; i<4;i++){
            this.ball = new Thing(this.unal,i,j);
            this.ball = new Thing(this.unal,i,j+5);
            if(i==2&&j==3){}                               
            else{this.ball = new Thing(this.unal,i+5,j);}
            
            if((i==2&&j==3)||(i==3&&j==2)||(i==3&&j==3)){}
            else{this.ball = new Thing(this.unal,i+5,j+5);}
        }
    }
    }
    
    public void recoger(){
        
        //No sé como se define un linea de codigo.(Donde termina?) No se supone el compilador quita todos los espacios y saltos de lineas?
        //CREO QUE HAY MAS DE 25 lineas de codigo,  PERO ¡RECOGE LA BASURA! :D        
        for(int i=0;i<2;i++){max.turnLeft();}max.move();max.turnLeft();
        for(int v=4;v>0;v--){for(int p=0; p<4;p++){
        for(int i=0;i<v;i++){max.move();if(max.canPickThing()){max.pickThing();}}max.turnLeft();
        for(int r=(5-v);r>0;r--){max.move();if(max.canPickThing()){max.pickThing();}}
        for(int j=0;j<3;j++){max.turnLeft();}
        for(int r=(5-v);r>0;r--){max.move();if(max.canPickThing()){max.pickThing();}
        if(max.frontIsClear()==false){for(int j=0;j<3;j++){max.turnLeft();}
        max.move();max.turnLeft();for(int j=0;j<2;j++){max.move();}max.turnLeft();
        max.move();if(max.canPickThing()){max.pickThing();} for(int j=0;j<3;j++){max.turnLeft();}}}max.turnLeft();
        for(int i=0;i<v;i++){max.move();}}}max.turnLeft();for(int i=0;i<4;i++){max.move();}max.turnLeft();max.move();}
}