package Ejercicio4;
import becker.robots.*;


public class Histograma {
    private Robot joe;
    private Thing balon;
    private City unal;

    public Histograma() {
        this.unal = new City(8,13);
        this.joe = new Robot(this.unal,0,1,Direction.SOUTH);
    }

    
    
    int a=0,b=0,c=0,d=0;
    
    public void numeros(int x,int y,int z, int w){
        
        //para 3 en 1,1
        for(int i=0;i<x;i++){
        this.balon = new Thing(this.unal,1,1);
        }
        //para 2 en 2,1
        for(int i=0;i<y;i++){
        this.balon = new Thing(this.unal,2,1);
        }
        //para 5 en 3,1
        for(int i=0;i<z;i++){
        this.balon = new Thing(this.unal,3,1);
        }
        //para 4 en 4,1
        for(int i=0;i<w;i++){
        this.balon = new Thing(this.unal,4,1);
        }
               
    }
    
    public void contar(){
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        a++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        b++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        c++;
    }
    joe.move();
    while(joe.canPickThing()){
        joe.pickThing();
        d++;
    }
    joe.turnLeft();
    joe.turnLeft();
        System.out.println("a: "+a+"\n b: "+b+"\n c: "+c+"\n d: "+d);
    }
   
    public void hacerCodigo(){
        //inicio e ida de joe/poner ball
        for(int i=0;i<3;i++){joe.turnLeft();}
        for(int i=0; i<d; i++){
        joe.putThing();
        if(i<d-1){joe.move();}
        }
        //regreso joe
        for(int i=0;i<2;i++){joe.turnLeft();}
        for(int i=0; i<d-1; i++){
        joe.move();
        }
        //reubicar joe
        for(int i=0;i<3;i++){joe.turnLeft();}
        joe.move();
        for(int i=0;i<3;i++){joe.turnLeft();}
        
        //joe en c
        for(int i=0; i<c; i++){
        joe.putThing();
        if(i<c-1){joe.move();}
        }
        for(int i=0;i<2;i++){joe.turnLeft();}
        for(int i=0; i<c-1; i++){
        joe.move();
        }
        for(int i=0;i<3;i++){joe.turnLeft();}
        joe.move();
        for(int i=0;i<3;i++){joe.turnLeft();}
        
        //joe en b
        for(int i=0; i<b; i++){
        joe.putThing();
        if(i<b-1){joe.move();}
        }
        for(int i=0;i<2;i++){joe.turnLeft();}
        for(int i=0; i<b-1; i++){
        joe.move();
        }
        for(int i=0;i<3;i++){joe.turnLeft();}
        joe.move();
        for(int i=0;i<3;i++){joe.turnLeft();}
        //joe en a
        for(int i=0; i<a; i++){
        joe.putThing();
        if(i<a-1){joe.move();}
        }
        for(int i=0;i<2;i++){joe.turnLeft();}
        for(int i=0; i<a-1; i++){
        joe.move();
        }
        for(int i=0;i<3;i++){joe.turnLeft();}
        joe.move();
        
        for(int i=0;i<2;i++){joe.turnLeft();}
        
    }
    
}
