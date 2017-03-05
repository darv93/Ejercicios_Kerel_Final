/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Diego
 */
import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class Nuggets {
    private Robot joe;
    private City unal;
    private Thing balon;
    private Thing balon1;
    private Wall a;
    public Nuggets(){
        this.unal=new City(10,10);
        this.joe=new Robot(unal,6,7,Direction.NORTH);
        this.balon=new Thing(unal,2,7);
        this.balon=new Thing(unal,3,5);
        this.balon=new Thing(unal,5,4);
        this.balon1=new Thing(unal,7,4);
        this.balon1.setColor(Color.BLUE);
        
    }
    public void Left(){
        joe.turnLeft();
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Right(){
        for(int i=0;i<=2;i++){
            joe.turnLeft();
        }
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Go(){
        joe.move();
        if(joe.canPickThing()==true){
            joe.pickThing();
        }
    }
    public void Round(){
        for(int i=0;i<=1;i++){
            joe.turnLeft();
        }
        joe.move();
    }
}
